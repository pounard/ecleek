/*
* generated by Xtext
*/
package org.processus.ecleek.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.processus.ecleek.services.LeekGrammarAccess;

public class LeekParser extends AbstractContentAssistParser {
	
	@Inject
	private LeekGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.processus.ecleek.ui.contentassist.antlr.internal.InternalLeekParser createParser() {
		org.processus.ecleek.ui.contentassist.antlr.internal.InternalLeekParser result = new org.processus.ecleek.ui.contentassist.antlr.internal.InternalLeekParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getIterationAccess().getAlternatives(), "rule__Iteration__Alternatives");
					put(grammarAccess.getForInVariableReferenceAccess().getAlternatives(), "rule__ForInVariableReference__Alternatives");
					put(grammarAccess.getComparisonAccess().getAlternatives_1_0(), "rule__Comparison__Alternatives_1_0");
					put(grammarAccess.getOrAccess().getAlternatives_1_0_1(), "rule__Or__Alternatives_1_0_1");
					put(grammarAccess.getAndAccess().getAlternatives_1_0_1(), "rule__And__Alternatives_1_0_1");
					put(grammarAccess.getAdditionAccess().getAlternatives_1_0(), "rule__Addition__Alternatives_1_0");
					put(grammarAccess.getMultiplicationAccess().getAlternatives_1_0(), "rule__Multiplication__Alternatives_1_0");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getVariableReferenceableAccess().getAlternatives(), "rule__VariableReferenceable__Alternatives");
					put(grammarAccess.getPostfixAccess().getAlternatives_1(), "rule__Postfix__Alternatives_1");
					put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
					put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
					put(grammarAccess.getStatementAccess().getGroup_3(), "rule__Statement__Group_3__0");
					put(grammarAccess.getStatementAccess().getGroup_4(), "rule__Statement__Group_4__0");
					put(grammarAccess.getStatementAccess().getGroup_7(), "rule__Statement__Group_7__0");
					put(grammarAccess.getStatementAccess().getGroup_9(), "rule__Statement__Group_9__0");
					put(grammarAccess.getStatementAccess().getGroup_10(), "rule__Statement__Group_10__0");
					put(grammarAccess.getStatementAccess().getGroup_11(), "rule__Statement__Group_11__0");
					put(grammarAccess.getStatementAccess().getGroup_12(), "rule__Statement__Group_12__0");
					put(grammarAccess.getBreakStatementAccess().getGroup(), "rule__BreakStatement__Group__0");
					put(grammarAccess.getContinueStatementAccess().getGroup(), "rule__ContinueStatement__Group__0");
					put(grammarAccess.getStatementBlockAccess().getGroup(), "rule__StatementBlock__Group__0");
					put(grammarAccess.getAffectationAccess().getGroup(), "rule__Affectation__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_5(), "rule__If__Group_5__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
					put(grammarAccess.getForInAccess().getGroup(), "rule__ForIn__Group__0");
					put(grammarAccess.getForInAccess().getGroup_2(), "rule__ForIn__Group_2__0");
					put(grammarAccess.getForInVariableReferenceAccess().getGroup_0(), "rule__ForInVariableReference__Group_0__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup(), "rule__FunctionDeclaration__Group__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_3(), "rule__FunctionDeclaration__Group_3__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_3_1(), "rule__FunctionDeclaration__Group_3_1__0");
					put(grammarAccess.getParameterDeclarationAccess().getGroup(), "rule__ParameterDeclaration__Group__0");
					put(grammarAccess.getLocalDeclarationAccess().getGroup(), "rule__LocalDeclaration__Group__0");
					put(grammarAccess.getLocalDeclarationAccess().getGroup_2(), "rule__LocalDeclaration__Group_2__0");
					put(grammarAccess.getGlobalDeclarationAccess().getGroup(), "rule__GlobalDeclaration__Group__0");
					put(grammarAccess.getGlobalDeclarationAccess().getGroup_2(), "rule__GlobalDeclaration__Group_2__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_1(), "rule__VariableDeclaration__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0_0(), "rule__Comparison__Group_1_0_0__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0_1(), "rule__Comparison__Group_1_0_1__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0_2(), "rule__Comparison__Group_1_0_2__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0_3(), "rule__Comparison__Group_1_0_3__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0_4(), "rule__Comparison__Group_1_0_4__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0_5(), "rule__Comparison__Group_1_0_5__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0_6(), "rule__Comparison__Group_1_0_6__0");
					put(grammarAccess.getComparisonAccess().getGroup_1_0_7(), "rule__Comparison__Group_1_0_7__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getOrAccess().getGroup_1_0(), "rule__Or__Group_1_0__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup_1_0(), "rule__And__Group_1_0__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_0(), "rule__Addition__Group_1_0_0__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_1(), "rule__Addition__Group_1_0_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0(), "rule__Multiplication__Group_1_0_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_1(), "rule__Multiplication__Group_1_0_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_5(), "rule__PrimaryExpression__Group_5__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_8(), "rule__PrimaryExpression__Group_8__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_9(), "rule__PrimaryExpression__Group_9__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_10(), "rule__PrimaryExpression__Group_10__0");
					put(grammarAccess.getArrayLiteralAccess().getGroup(), "rule__ArrayLiteral__Group__0");
					put(grammarAccess.getArrayLiteralAccess().getGroup_2(), "rule__ArrayLiteral__Group_2__0");
					put(grammarAccess.getArrayLiteralAccess().getGroup_2_1(), "rule__ArrayLiteral__Group_2_1__0");
					put(grammarAccess.getPostfixAccess().getGroup(), "rule__Postfix__Group__0");
					put(grammarAccess.getPostfixAccess().getGroup_1_0(), "rule__Postfix__Group_1_0__0");
					put(grammarAccess.getPostfixAccess().getGroup_1_1(), "rule__Postfix__Group_1_1__0");
					put(grammarAccess.getVariableReferenceAccess().getGroup(), "rule__VariableReference__Group__0");
					put(grammarAccess.getVariableReferenceAccess().getGroup_1(), "rule__VariableReference__Group_1__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_3(), "rule__FunctionCall__Group_3__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_3_1(), "rule__FunctionCall__Group_3_1__0");
					put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
					put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
					put(grammarAccess.getScriptAccess().getStatementsAssignment(), "rule__Script__StatementsAssignment");
					put(grammarAccess.getStatementBlockAccess().getStatementsAssignment_2(), "rule__StatementBlock__StatementsAssignment_2");
					put(grammarAccess.getAffectationAccess().getVariableAssignment_0(), "rule__Affectation__VariableAssignment_0");
					put(grammarAccess.getAffectationAccess().getValueAssignment_2(), "rule__Affectation__ValueAssignment_2");
					put(grammarAccess.getIfAccess().getConditionAssignment_2(), "rule__If__ConditionAssignment_2");
					put(grammarAccess.getIfAccess().getThenAssignment_4(), "rule__If__ThenAssignment_4");
					put(grammarAccess.getIfAccess().getElseAssignment_5_1(), "rule__If__ElseAssignment_5_1");
					put(grammarAccess.getWhileAccess().getConditionAssignment_2(), "rule__While__ConditionAssignment_2");
					put(grammarAccess.getWhileAccess().getStatementAssignment_4(), "rule__While__StatementAssignment_4");
					put(grammarAccess.getForAccess().getInitializerAssignment_2(), "rule__For__InitializerAssignment_2");
					put(grammarAccess.getForAccess().getConditionAssignment_4(), "rule__For__ConditionAssignment_4");
					put(grammarAccess.getForAccess().getIncrementAssignment_6(), "rule__For__IncrementAssignment_6");
					put(grammarAccess.getForAccess().getStatementAssignment_8(), "rule__For__StatementAssignment_8");
					put(grammarAccess.getForInAccess().getKeyAssignment_2_0(), "rule__ForIn__KeyAssignment_2_0");
					put(grammarAccess.getForInAccess().getValueAssignment_3(), "rule__ForIn__ValueAssignment_3");
					put(grammarAccess.getForInAccess().getArrayAssignment_5(), "rule__ForIn__ArrayAssignment_5");
					put(grammarAccess.getForInAccess().getStatementAssignment_7(), "rule__ForIn__StatementAssignment_7");
					put(grammarAccess.getForInVariableReferenceAccess().getNameAssignment_0_1(), "rule__ForInVariableReference__NameAssignment_0_1");
					put(grammarAccess.getForInVariableReferenceAccess().getVariableAssignment_1(), "rule__ForInVariableReference__VariableAssignment_1");
					put(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_1(), "rule__FunctionDeclaration__NameAssignment_1");
					put(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_3_0(), "rule__FunctionDeclaration__ParametersAssignment_3_0");
					put(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_3_1_1(), "rule__FunctionDeclaration__ParametersAssignment_3_1_1");
					put(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_5(), "rule__FunctionDeclaration__BodyAssignment_5");
					put(grammarAccess.getParameterDeclarationAccess().getByAdressAssignment_0(), "rule__ParameterDeclaration__ByAdressAssignment_0");
					put(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1(), "rule__ParameterDeclaration__NameAssignment_1");
					put(grammarAccess.getLocalDeclarationAccess().getVariablesAssignment_1(), "rule__LocalDeclaration__VariablesAssignment_1");
					put(grammarAccess.getLocalDeclarationAccess().getVariablesAssignment_2_1(), "rule__LocalDeclaration__VariablesAssignment_2_1");
					put(grammarAccess.getGlobalDeclarationAccess().getVariablesAssignment_1(), "rule__GlobalDeclaration__VariablesAssignment_1");
					put(grammarAccess.getGlobalDeclarationAccess().getVariablesAssignment_2_1(), "rule__GlobalDeclaration__VariablesAssignment_2_1");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0(), "rule__VariableDeclaration__NameAssignment_0");
					put(grammarAccess.getVariableDeclarationAccess().getValueAssignment_1_1(), "rule__VariableDeclaration__ValueAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_1(), "rule__Comparison__RightAssignment_1_1");
					put(grammarAccess.getOrAccess().getRightAssignment_1_1(), "rule__Or__RightAssignment_1_1");
					put(grammarAccess.getAndAccess().getRightAssignment_1_1(), "rule__And__RightAssignment_1_1");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_1(), "rule__Addition__RightAssignment_1_1");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1(), "rule__Multiplication__RightAssignment_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1(), "rule__PrimaryExpression__ValueAssignment_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1(), "rule__PrimaryExpression__ValueAssignment_2_1");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_5_1(), "rule__PrimaryExpression__ValueAssignment_5_1");
					put(grammarAccess.getArrayLiteralAccess().getValuesAssignment_2_0(), "rule__ArrayLiteral__ValuesAssignment_2_0");
					put(grammarAccess.getArrayLiteralAccess().getValuesAssignment_2_1_1(), "rule__ArrayLiteral__ValuesAssignment_2_1_1");
					put(grammarAccess.getVariableReferenceAccess().getVariableAssignment_0(), "rule__VariableReference__VariableAssignment_0");
					put(grammarAccess.getVariableReferenceAccess().getDimensionsAssignment_1_1(), "rule__VariableReference__DimensionsAssignment_1_1");
					put(grammarAccess.getFunctionCallAccess().getFunctionAssignment_1(), "rule__FunctionCall__FunctionAssignment_1");
					put(grammarAccess.getFunctionCallAccess().getArgsAssignment_3_0(), "rule__FunctionCall__ArgsAssignment_3_0");
					put(grammarAccess.getFunctionCallAccess().getArgsAssignment_3_1_1(), "rule__FunctionCall__ArgsAssignment_3_1_1");
					put(grammarAccess.getReturnStatementAccess().getValueAssignment_1(), "rule__ReturnStatement__ValueAssignment_1");
					put(grammarAccess.getIncludeAccess().getImportURIAssignment_2(), "rule__Include__ImportURIAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.processus.ecleek.ui.contentassist.antlr.internal.InternalLeekParser typedParser = (org.processus.ecleek.ui.contentassist.antlr.internal.InternalLeekParser) parser;
			typedParser.entryRuleScript();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LeekGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LeekGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
