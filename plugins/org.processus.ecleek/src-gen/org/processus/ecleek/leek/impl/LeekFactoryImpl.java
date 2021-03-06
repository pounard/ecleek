/**
 */
package org.processus.ecleek.leek.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.processus.ecleek.leek.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeekFactoryImpl extends EFactoryImpl implements LeekFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LeekFactory init()
  {
    try
    {
      LeekFactory theLeekFactory = (LeekFactory)EPackage.Registry.INSTANCE.getEFactory(LeekPackage.eNS_URI);
      if (theLeekFactory != null)
      {
        return theLeekFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LeekFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeekFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LeekPackage.SCRIPT: return createScript();
      case LeekPackage.STATEMENT: return createStatement();
      case LeekPackage.BREAK_STATEMENT: return createBreakStatement();
      case LeekPackage.CONTINUE_STATEMENT: return createContinueStatement();
      case LeekPackage.STATEMENT_BLOCK: return createStatementBlock();
      case LeekPackage.AFFECTATION_STATEMENT: return createAffectationStatement();
      case LeekPackage.AFFECTATION: return createAffectation();
      case LeekPackage.AFFECTATION_DECREMENT: return createAffectationDecrement();
      case LeekPackage.AFFECTATION_INCREMENT: return createAffectationIncrement();
      case LeekPackage.AFFECTATION_POSTFIX_STATEMENT: return createAffectationPostfixStatement();
      case LeekPackage.AFFECTATION_PREFIX_STATEMENT: return createAffectationPrefixStatement();
      case LeekPackage.IF: return createIf();
      case LeekPackage.IF_CONDITION: return createIfCondition();
      case LeekPackage.ITERATION: return createIteration();
      case LeekPackage.WHILE: return createWhile();
      case LeekPackage.FOR: return createFor();
      case LeekPackage.FOR_IN: return createForIn();
      case LeekPackage.FOR_IN_VARIABLE_REFERENCE: return createForInVariableReference();
      case LeekPackage.FOR_INITIALIZER: return createForInitializer();
      case LeekPackage.FOR_AFFECTATION: return createForAffectation();
      case LeekPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case LeekPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case LeekPackage.LOCAL_DECLARATION: return createLocalDeclaration();
      case LeekPackage.GLOBAL_DECLARATION: return createGlobalDeclaration();
      case LeekPackage.EXPRESSION: return createExpression();
      case LeekPackage.ARRAY_LITERAL: return createArrayLiteral();
      case LeekPackage.POSTFIX: return createPostfix();
      case LeekPackage.PREFIX: return createPrefix();
      case LeekPackage.VARIABLE_REFERENCE: return createVariableReference();
      case LeekPackage.FUNCTION_CALL: return createFunctionCall();
      case LeekPackage.RETURN_STATEMENT: return createReturnStatement();
      case LeekPackage.INCLUDE: return createInclude();
      case LeekPackage.EMPTY_STATEMENT: return createEmptyStatement();
      case LeekPackage.POSTFIX_DECREMENT: return createPostfixDecrement();
      case LeekPackage.POSTFIX_INCREMENT: return createPostfixIncrement();
      case LeekPackage.PREFIX_DECREMENT: return createPrefixDecrement();
      case LeekPackage.PREFIX_INCREMENT: return createPrefixIncrement();
      case LeekPackage.COMPARISON: return createComparison();
      case LeekPackage.EQUALS: return createEquals();
      case LeekPackage.TYPED_DIFFERENT: return createTypedDifferent();
      case LeekPackage.DIFFERENT: return createDifferent();
      case LeekPackage.LESS_OR_EQUALS: return createLessOrEquals();
      case LeekPackage.LESS: return createLess();
      case LeekPackage.MORE_OR_EQUALS: return createMoreOrEquals();
      case LeekPackage.MORE: return createMore();
      case LeekPackage.OR: return createOr();
      case LeekPackage.AND: return createAnd();
      case LeekPackage.PLUS: return createPlus();
      case LeekPackage.MINUS: return createMinus();
      case LeekPackage.MULTI: return createMulti();
      case LeekPackage.DIV: return createDiv();
      case LeekPackage.TERNARY_IF: return createTernaryIf();
      case LeekPackage.UNITARY_MINUS: return createUnitaryMinus();
      case LeekPackage.NOT: return createNot();
      case LeekPackage.REAL_LITERAL: return createRealLiteral();
      case LeekPackage.INT_LITERAL: return createIntLiteral();
      case LeekPackage.STRING_LITERAL: return createStringLiteral();
      case LeekPackage.NULL_LITERAL: return createNullLiteral();
      case LeekPackage.FALSE_LITERAL: return createFalseLiteral();
      case LeekPackage.TRUE_LITERAL: return createTrueLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakStatement createBreakStatement()
  {
    BreakStatementImpl breakStatement = new BreakStatementImpl();
    return breakStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinueStatement createContinueStatement()
  {
    ContinueStatementImpl continueStatement = new ContinueStatementImpl();
    return continueStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock createStatementBlock()
  {
    StatementBlockImpl statementBlock = new StatementBlockImpl();
    return statementBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AffectationStatement createAffectationStatement()
  {
    AffectationStatementImpl affectationStatement = new AffectationStatementImpl();
    return affectationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Affectation createAffectation()
  {
    AffectationImpl affectation = new AffectationImpl();
    return affectation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AffectationDecrement createAffectationDecrement()
  {
    AffectationDecrementImpl affectationDecrement = new AffectationDecrementImpl();
    return affectationDecrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AffectationIncrement createAffectationIncrement()
  {
    AffectationIncrementImpl affectationIncrement = new AffectationIncrementImpl();
    return affectationIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AffectationPostfixStatement createAffectationPostfixStatement()
  {
    AffectationPostfixStatementImpl affectationPostfixStatement = new AffectationPostfixStatementImpl();
    return affectationPostfixStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AffectationPrefixStatement createAffectationPrefixStatement()
  {
    AffectationPrefixStatementImpl affectationPrefixStatement = new AffectationPrefixStatementImpl();
    return affectationPrefixStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfCondition createIfCondition()
  {
    IfConditionImpl ifCondition = new IfConditionImpl();
    return ifCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iteration createIteration()
  {
    IterationImpl iteration = new IterationImpl();
    return iteration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForIn createForIn()
  {
    ForInImpl forIn = new ForInImpl();
    return forIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForInVariableReference createForInVariableReference()
  {
    ForInVariableReferenceImpl forInVariableReference = new ForInVariableReferenceImpl();
    return forInVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForInitializer createForInitializer()
  {
    ForInitializerImpl forInitializer = new ForInitializerImpl();
    return forInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForAffectation createForAffectation()
  {
    ForAffectationImpl forAffectation = new ForAffectationImpl();
    return forAffectation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalDeclaration createLocalDeclaration()
  {
    LocalDeclarationImpl localDeclaration = new LocalDeclarationImpl();
    return localDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalDeclaration createGlobalDeclaration()
  {
    GlobalDeclarationImpl globalDeclaration = new GlobalDeclarationImpl();
    return globalDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayLiteral createArrayLiteral()
  {
    ArrayLiteralImpl arrayLiteral = new ArrayLiteralImpl();
    return arrayLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Postfix createPostfix()
  {
    PostfixImpl postfix = new PostfixImpl();
    return postfix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix createPrefix()
  {
    PrefixImpl prefix = new PrefixImpl();
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyStatement createEmptyStatement()
  {
    EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
    return emptyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostfixDecrement createPostfixDecrement()
  {
    PostfixDecrementImpl postfixDecrement = new PostfixDecrementImpl();
    return postfixDecrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostfixIncrement createPostfixIncrement()
  {
    PostfixIncrementImpl postfixIncrement = new PostfixIncrementImpl();
    return postfixIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixDecrement createPrefixDecrement()
  {
    PrefixDecrementImpl prefixDecrement = new PrefixDecrementImpl();
    return prefixDecrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixIncrement createPrefixIncrement()
  {
    PrefixIncrementImpl prefixIncrement = new PrefixIncrementImpl();
    return prefixIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedDifferent createTypedDifferent()
  {
    TypedDifferentImpl typedDifferent = new TypedDifferentImpl();
    return typedDifferent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Different createDifferent()
  {
    DifferentImpl different = new DifferentImpl();
    return different;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LessOrEquals createLessOrEquals()
  {
    LessOrEqualsImpl lessOrEquals = new LessOrEqualsImpl();
    return lessOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Less createLess()
  {
    LessImpl less = new LessImpl();
    return less;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoreOrEquals createMoreOrEquals()
  {
    MoreOrEqualsImpl moreOrEquals = new MoreOrEqualsImpl();
    return moreOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public More createMore()
  {
    MoreImpl more = new MoreImpl();
    return more;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TernaryIf createTernaryIf()
  {
    TernaryIfImpl ternaryIf = new TernaryIfImpl();
    return ternaryIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitaryMinus createUnitaryMinus()
  {
    UnitaryMinusImpl unitaryMinus = new UnitaryMinusImpl();
    return unitaryMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FalseLiteral createFalseLiteral()
  {
    FalseLiteralImpl falseLiteral = new FalseLiteralImpl();
    return falseLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrueLiteral createTrueLiteral()
  {
    TrueLiteralImpl trueLiteral = new TrueLiteralImpl();
    return trueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeekPackage getLeekPackage()
  {
    return (LeekPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LeekPackage getPackage()
  {
    return LeekPackage.eINSTANCE;
  }

} //LeekFactoryImpl
