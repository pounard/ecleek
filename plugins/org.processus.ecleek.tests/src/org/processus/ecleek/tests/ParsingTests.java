package org.processus.ecleek.tests;

import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.junit.Test;
import org.processus.ecleek.LeekStandaloneSetup;
import org.processus.ecleek.leek.GlobalDeclaration;
import org.processus.ecleek.leek.IntLiteral;
import org.processus.ecleek.leek.LocalDeclaration;
import org.processus.ecleek.leek.Script;
import org.processus.ecleek.leek.VariableReference;

public class ParsingTests extends AbstractXtextTests {

	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(new LeekStandaloneSetup());
	}


	protected Script getScript(String string) throws Exception {
		Script res = (Script) getModel(string);
		return res;
	}

	@Test
	public void globalDeclarationSingleNoValue() throws Exception {
		final Script script = getScript("global aGlobal;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertEquals(null, global.getVariables().get(0).getValue());
	}

	@Test
	public void globalDeclarationSingleValue() throws Exception {
		final Script script = getScript("global aGlobal = 1;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)global.getVariables().get(0).getValue()).getValue());
	}

	@Test
	public void globalDeclarationNoValue() throws Exception {
		final Script script = getScript("global aGlobal, anotherGlobal;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(2, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertEquals(null, global.getVariables().get(0).getValue());
		assertEquals("anotherGlobal", global.getVariables().get(1).getName());
		assertEquals(null, global.getVariables().get(1).getValue());
	}

	@Test
	public void globalDeclarationValue() throws Exception {
		final Script script = getScript("global aGlobal = 1, anotherGlobal = 2;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(2, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)global.getVariables().get(0).getValue()).getValue());
		assertEquals("anotherGlobal", global.getVariables().get(1).getName());
		assertTrue(global.getVariables().get(1).getValue() instanceof IntLiteral);
		assertEquals(2,((IntLiteral)global.getVariables().get(1).getValue()).getValue());
	}

	@Test
	public void localDeclarationSingleNoValue() throws Exception {
		final Script script = getScript("var aGlobal;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertEquals(null, global.getVariables().get(0).getValue());
	}

	@Test
	public void localDeclarationSingleValue() throws Exception {
		final Script script = getScript("var aGlobal = 1;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)global.getVariables().get(0).getValue()).getValue());
	}

	@Test
	public void localDeclarationNoValue() throws Exception {
		final Script script = getScript("var aGlobal, anotherGlobal;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(2, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertEquals(null, global.getVariables().get(0).getValue());
		assertEquals("anotherGlobal", global.getVariables().get(1).getName());
		assertEquals(null, global.getVariables().get(1).getValue());
	}

	@Test
	public void localDeclarationValue() throws Exception {
		final Script script = getScript("var aGlobal = 1, anotherGlobal = 2;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(2, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)global.getVariables().get(0).getValue()).getValue());
		assertEquals("anotherGlobal", global.getVariables().get(1).getName());
		assertTrue(global.getVariables().get(1).getValue() instanceof IntLiteral);
		assertEquals(2,((IntLiteral)global.getVariables().get(1).getValue()).getValue());
	}

	@Test
	public void variableReferenceToGlobalVariableNoDimension() throws Exception {
		final Script script = getScript("global a = a;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("a", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) global.getVariables().get(0).getValue();
		assertEquals(global.getVariables().get(0), varRef.getVariable());
		assertEquals(0, varRef.getDimensions().size());
	}
	
	@Test
	public void variableReferenceToLocalVariableNoDimension() throws Exception {
		final Script script = getScript("var a = a;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("a", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) global.getVariables().get(0).getValue();
		assertEquals(global.getVariables().get(0), varRef.getVariable());
		assertEquals(0, varRef.getDimensions().size());
	}
	
	@Test
	public void variableReferenceToGlobalVariableEmptyDimension() throws Exception {
		getModelAndExpect("global a = a[];", 1);
	}
	
	@Test
	public void variableReferenceToLocalVariableEmptyDimension() throws Exception {
		getModelAndExpect("var a = a[];", 1);
	}
	
	@Test
	public void variableReferenceToGlobalVariableOneDimension() throws Exception {
		final Script script = getScript("global a = a[1];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("a", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) global.getVariables().get(0).getValue();
		assertEquals(global.getVariables().get(0), varRef.getVariable());
		assertEquals(1, varRef.getDimensions().size());
		assertTrue(varRef.getDimensions().get(0) instanceof IntLiteral);
		final IntLiteral dim = (IntLiteral) varRef.getDimensions().get(0);
		assertEquals(1, dim.getValue());
	}
	
	@Test
	public void variableReferenceToLocalVariableOneDimension() throws Exception {
		final Script script = getScript("var a = a[1];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("a", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) global.getVariables().get(0).getValue();
		assertEquals(global.getVariables().get(0), varRef.getVariable());
		assertEquals(1, varRef.getDimensions().size());
		assertTrue(varRef.getDimensions().get(0) instanceof IntLiteral);
		final IntLiteral dim = (IntLiteral) varRef.getDimensions().get(0);
		assertEquals(1, dim.getValue());
	}
	
	@Test
	public void variableReferenceToGlobalVariableTwoDimensions() throws Exception {
		final Script script = getScript("global a = a[1][2];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("a", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) global.getVariables().get(0).getValue();
		assertEquals(global.getVariables().get(0), varRef.getVariable());
		assertEquals(2, varRef.getDimensions().size());
		assertTrue(varRef.getDimensions().get(0) instanceof IntLiteral);
		IntLiteral dim = (IntLiteral) varRef.getDimensions().get(0);
		assertEquals(1, dim.getValue());
		assertTrue(varRef.getDimensions().get(1) instanceof IntLiteral);
		dim = (IntLiteral) varRef.getDimensions().get(1);
		assertEquals(2, dim.getValue());
	}
	
	@Test
	public void variableReferenceToLocalVariableTwoDimensions() throws Exception {
		final Script script = getScript("var a = a[1][2];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("a", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) global.getVariables().get(0).getValue();
		assertEquals(global.getVariables().get(0), varRef.getVariable());
		assertEquals(2, varRef.getDimensions().size());
		assertTrue(varRef.getDimensions().get(0) instanceof IntLiteral);
		IntLiteral dim = (IntLiteral) varRef.getDimensions().get(0);
		assertEquals(1, dim.getValue());
		assertTrue(varRef.getDimensions().get(1) instanceof IntLiteral);
		dim = (IntLiteral) varRef.getDimensions().get(0);
		assertEquals(2, dim.getValue());
	}

}
