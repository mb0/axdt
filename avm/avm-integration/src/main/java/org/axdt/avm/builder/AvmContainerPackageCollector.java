package org.axdt.avm.builder;

import java.util.List;
import java.util.Set;

import org.axdt.core.AxdtCore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class AvmContainerPackageCollector implements IResourceDeltaVisitor, IResourceVisitor{
	public static class ProjectResult {
		protected final IProject project;
		protected final Set<IPath> additions = Sets.newHashSet();
		protected final Set<IPath> deletions = Sets.newHashSet();
		protected boolean clear = false;
		public ProjectResult(IProject project) {
			this.project = project;
		}
		public IProject getProject() {
			return project;
		}
		public Set<IPath> getAdditions() {
			return additions;
		}
		public Set<IPath> getDeletions() {
			return deletions;
		}
	}
	protected final List<ProjectResult> results = Lists.newArrayList();
	protected ProjectResult result = null;
	
	public boolean visit(IResourceDelta delta) throws CoreException {
		IResource res = delta.getResource();
		switch (res.getType()) {
		case IResource.ROOT:
			return true;
		case IResource.PROJECT:
			return checkProject(res.getProject()); 
		case IResource.FOLDER:
			if (delta.getKind() == IResourceDelta.REMOVED) {
				result.deletions.add(res.getFullPath());
			}
			return true;
		case IResource.FILE:
			if (delta.getKind() == IResourceDelta.ADDED) {
				checkFile(res);
			}
			return false;
		}
		return false;
	}

	public boolean visit(IResource res) throws CoreException {
		switch (res.getType()) {
		case IResource.ROOT:
			return true;
		case IResource.PROJECT:
			return checkProject(res.getProject());
		case IResource.FOLDER:
			return true;
		case IResource.FILE:
			checkFile(res);
			return false;
		}
		return false;
	}

	private void checkFile(IResource res) {
		String extension = res.getFileExtension();
		if ("as".equals(extension)||"mxml".equals(extension)) {
			result.additions.add(res.getParent().getFullPath());
		}
	}

	private boolean checkProject(IProject project) throws CoreException {
		if (project.isAccessible() && project.hasNature(AxdtCore.NATURE_ID)) {
			result = new ProjectResult(project);
			results.add(result);
			return true;
		}
		result = null;
		return false;
	}
	public List<ProjectResult> getResults() {
		return results;
	}
}
