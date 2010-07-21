package org.axdt.as3.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.reconstr.ITokenSerializer;
import org.eclipse.xtext.parsetree.reconstr.impl.ValueSerializer;

import com.google.inject.Inject;

/**
 * @author mb0
 */
public class As3ValueSerializer extends ValueSerializer {

	@Inject
	private IValueConverterService converter;
	
	@Override
	public String serializeAssignedValue(EObject context, RuleCall ruleCall, Object value, AbstractNode node) {
		if (node != null) {
			String ruleName = ruleCall.getRule().getName();
			Object converted = converter.toValue(serialize(node), ruleName, node);
			if (!ruleName.endsWith("FQN") && converted != null && converted.equals(value))
				return ITokenSerializer.KEEP_VALUE_FROM_NODE_MODEL;
		}
		return converter.toString(value, ruleCall.getRule().getName());
	}
	@Override
	protected String serializeUnassignedValueByRule(AbstractRule rule, EObject current,
			AbstractNode node) {
		String ruleName = rule.getName();
		if ("LT".equals(ruleName))
			return "\n";
		if ("GenericVarTypeAssign".equals(ruleName))
			return "* =";
		if ("VirtualSemi".equals(ruleName))
			return ";";
		return null;
	}
}
