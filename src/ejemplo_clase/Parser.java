
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sun Jun 18 23:15:00 CST 2017
//----------------------------------------------------

package ejemplo_clase;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import java.util.List;

/** CUP v0.10k generated parser.
  * @version Sun Jun 18 23:15:00 CST 2017
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\004\000\002\003\006\000\002\003" +
    "\005\000\002\013\003\000\002\013\003\000\002\004\005" +
    "\000\002\004\003\000\002\007\005\000\002\007\003\000" +
    "\002\005\003\000\002\010\005\000\002\010\005\000\002" +
    "\010\003\000\002\011\005\000\002\011\005\000\002\011" +
    "\003\000\002\012\003\000\002\012\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\006\016\007\017\004\001\002\000\004\006" +
    "\ufffd\001\002\000\004\006\014\001\002\000\010\002\011" +
    "\016\007\017\004\001\002\000\004\006\ufffe\001\002\000" +
    "\004\006\014\001\002\000\004\002\001\001\002\000\006" +
    "\004\035\005\034\001\002\000\006\004\ufffb\005\ufffb\001" +
    "\002\000\010\004\ufff9\005\ufff9\010\015\001\002\000\006" +
    "\007\023\015\020\001\002\000\016\004\ufff5\005\ufff5\011" +
    "\ufff5\012\ufff5\013\030\014\027\001\002\000\016\004\ufff2" +
    "\005\ufff2\011\ufff2\012\ufff2\013\ufff2\014\ufff2\001\002\000" +
    "\016\004\ufff0\005\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0" +
    "\001\002\000\012\004\ufff8\005\ufff8\011\024\012\025\001" +
    "\002\000\006\004\ufffa\005\ufffa\001\002\000\016\004\ufff1" +
    "\005\ufff1\011\ufff1\012\ufff1\013\ufff1\014\ufff1\001\002\000" +
    "\006\007\023\015\020\001\002\000\006\007\023\015\020" +
    "\001\002\000\016\004\ufff6\005\ufff6\011\ufff6\012\ufff6\013" +
    "\030\014\027\001\002\000\006\007\023\015\020\001\002" +
    "\000\006\007\023\015\020\001\002\000\016\004\ufff4\005" +
    "\ufff4\011\ufff4\012\ufff4\013\ufff4\014\ufff4\001\002\000\016" +
    "\004\ufff3\005\ufff3\011\ufff3\012\ufff3\013\ufff3\014\ufff3\001" +
    "\002\000\016\004\ufff7\005\ufff7\011\ufff7\012\ufff7\013\030" +
    "\014\027\001\002\000\004\006\014\001\002\000\010\002" +
    "\000\016\000\017\000\001\002\000\006\004\ufffc\005\ufffc" +
    "\001\002\000\006\004\040\005\034\001\002\000\010\002" +
    "\uffff\016\uffff\017\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\006\003\005\013\004\001\001\000\002\001" +
    "\001\000\006\004\036\007\012\001\001\000\004\013\007" +
    "\001\001\000\002\001\001\000\006\004\011\007\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\005\021\010\020\011\015\012" +
    "\016\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\011\032\012\016\001\001\000\006\011\025" +
    "\012\016\001\001\000\002\001\001\000\004\012\031\001" +
    "\001\000\004\012\030\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\035\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        public List<String> datos = new ArrayList<String>();
        public int x;
        public int y;

    @Override
    public void syntax_error(Symbol s){
        System.out.println(s  +" Linea "+s.left+1 +"  Columna "+s.right   +" "+ (String)s.value);
    }

    @Override
    public void unrecovered_syntax_error(Symbol s){
        System.out.println(s);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {


	public double resultado=0;
        plot_tree load = new plot_tree();
        String rama="";
        int tkn=0;
        String izq="",der="";

  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // H ::= TXTCOMILLA 
            {
              Object RESULT = null;
		int valorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		String valor = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
        RESULT =valor;
    
              CUP$Parser$result = new java_cup.runtime.Symbol(8/*H*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // H ::= ENTERO 
            {
              Object RESULT = null;
		int valorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		String valor = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
        tkn++;
        RESULT =valor;
    
              CUP$Parser$result = new java_cup.runtime.Symbol(8/*H*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // T ::= H 
            {
              Object RESULT = null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		  
        tkn++;
        String CADENA="\""+Integer.toString(tkn)+"_H\"";
        String res = CADENA+"->\""+n1+"\";\n";
        System.out.println(res);
        RESULT = CADENA;
    
              CUP$Parser$result = new java_cup.runtime.Symbol(7/*T*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // T ::= T DIV H 
            {
              Object RESULT = null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
        tkn++;
        String cad="";

        String MAIN_T="\""+Integer.toString(tkn)+"_T\"";
        tkn++;
        String T_N="\""+Integer.toString(tkn)+"_T\"";
        cad+=MAIN_T+"->"+T_N+";\n";       
        cad+=T_N+"->"+n1+";\n";   
        tkn++;
        cad+=MAIN_T+"->"+"\""+Integer.toString(tkn)+"_/\";\n";
        tkn++;
        T_N="\""+Integer.toString(tkn)+"_H\"";
        cad+=MAIN_T+"->"+T_N+";\n";      
        cad+=T_N+"->"+n2+";\n";                 
        System.out.println(cad);
        RESULT = MAIN_T;
        //RESULT=Double.parseDouble(n1.toString())/Double.parseDouble(n2.toString());
        
    
              CUP$Parser$result = new java_cup.runtime.Symbol(7/*T*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // T ::= T POR H 
            {
              Object RESULT = null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 
        tkn++;
        String cad="";

        String MAIN_T="\""+Integer.toString(tkn)+"_T\"";
        tkn++;
        String T_N="\""+Integer.toString(tkn)+"_T\"";
        cad+=MAIN_T+"->"+T_N+";\n";       
        cad+=T_N+"->"+n1+";\n";   
        tkn++;
        cad+=MAIN_T+"->"+"\""+Integer.toString(tkn)+"_*\";\n";
        tkn++;
        T_N="\""+Integer.toString(tkn)+"_H\"";
        cad+=MAIN_T+"->"+T_N+";\n";      
        cad+=T_N+"->"+n2+";\n";                 
        System.out.println(cad);
        RESULT = MAIN_T;
        //RESULT=Double.parseDouble(n1.toString())*Double.parseDouble(n2.toString());
    
              CUP$Parser$result = new java_cup.runtime.Symbol(7/*T*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // E ::= T 
            {
              Object RESULT = null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		  
        tkn++;
        String CADENA="\""+Integer.toString(tkn)+"_T\"";
        String res = CADENA+"->"+n1+";";
        System.out.println(res);
        RESULT = CADENA;
    
              CUP$Parser$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // E ::= E MENOS T 
            {
              Object RESULT = null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
        tkn++;
        String cad="";

        String MAIN_T="\""+Integer.toString(tkn)+"_E\"";
        tkn++;
        String T_N="\""+Integer.toString(tkn)+"_E\"";
        cad+=MAIN_T+"->"+T_N+";\n";       
        cad+=T_N+"->"+n1+";\n";   
        tkn++;
        cad+=MAIN_T+"->"+"\""+Integer.toString(tkn)+"_-\";\n";
        tkn++;
        T_N="\""+Integer.toString(tkn)+"_T\"";
        cad+=MAIN_T+"->"+T_N+";\n";      
        cad+=T_N+"->"+n2+";\n";                 
        System.out.println(cad);
        RESULT = MAIN_T;
        //RESULT=Double.parseDouble(n1.toString())-Double.parseDouble(n2.toString());
    
              CUP$Parser$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // E ::= E MAS T 
            {
              Object RESULT = null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 
        tkn++;
        String cad="";

        String MAIN_T="\""+Integer.toString(tkn)+"_E\"";
        tkn++;
        String T_N="\""+Integer.toString(tkn)+"_E\"";
        cad+=MAIN_T+"->"+T_N+";\n";       
        cad+=T_N+"->"+n1+";\n";   
        tkn++;
        cad+=MAIN_T+"->"+"\""+Integer.toString(tkn)+"_+\";\n";
        tkn++;
        T_N="\""+Integer.toString(tkn)+"_T\"";
        cad+=MAIN_T+"->"+T_N+";\n";      
        cad+=T_N+"->"+n2+";\n";                 
        System.out.println(cad);
        RESULT = MAIN_T;
        //RESULT=Double.parseDouble(n1.toString())+Double.parseDouble(n2.toString());
    
              CUP$Parser$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // op ::= E 
            {
              Object RESULT = null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		 
        tkn++;
        String CADENA="\""+Integer.toString(tkn)+"_E\"";
        String res = CADENA+"->"+n1+";\n";
        System.out.println(res);
        RESULT = CADENA;

              CUP$Parser$result = new java_cup.runtime.Symbol(3/*op*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // val ::= CADENA 
            {
              Object RESULT = null;
		int caleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int caright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		String ca = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
        tkn++;
        String CADENA="\""+Integer.toString(tkn)+"_CADENA\"";
        tkn++;
        String resCAD="\""+Integer.toString(tkn+1)+"_"+ca+"\"";
        RESULT=CADENA;
        System.out.println(CADENA+"->"+resCAD+";");
    
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*val*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // val ::= CADENA IGUAL op 
            {
              Object RESULT = null;
		int caleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int caright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String ca = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int operacionleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int operacionright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object operacion = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
        tkn++;
        String CADENA="\""+Integer.toString(tkn)+"_CADENA\"";
        tkn++;
        String resCAD="\""+Integer.toString(tkn)+"_"+ca+"\"";
        tkn++;
        String IGUAL_C="\""+Integer.toString(tkn)+"_=\"";
        RESULT=CADENA;
        
        System.out.println(CADENA+"->"+resCAD+";");
        System.out.println(CADENA+"->"+IGUAL_C+";");
        System.out.println(CADENA+"->"+operacion+";");
    
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*val*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // listaid ::= val 
            {
              Object RESULT = null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		

        tkn++;
        String LISTA_R="\""+Integer.toString(tkn)+"_LISTA\"";
        tkn++;
        String VALOR_R="\""+Integer.toString(tkn)+"_VALOR\"";
        System.out.println(LISTA_R+"->"+VALOR_R+";");
        System.out.println(VALOR_R+"->"+val+";\n");
        
        RESULT=LISTA_R;
    
              CUP$Parser$result = new java_cup.runtime.Symbol(2/*listaid*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // listaid ::= listaid COMA val 
            {
              Object RESULT = null;
		int v1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
        tkn++;
        String LISTA_R="\""+Integer.toString(tkn)+"_LISTA\"";
        tkn++;
        String COMA_R="\""+Integer.toString(tkn)+"_COMA\"";
        tkn++;
        String VALOR_R="\""+Integer.toString(tkn)+"_VALOR\"";

        System.out.println(LISTA_R+"->"+v1+";\n");
        System.out.println(LISTA_R+"->"+COMA_R+";\n");
        System.out.println(LISTA_R+"->"+VALOR_R+";\n");
        System.out.println(VALOR_R+"->"+val+";\n");
        RESULT=LISTA_R;
    
              CUP$Parser$result = new java_cup.runtime.Symbol(2/*listaid*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // tipo ::= STRING 
            {
              Object RESULT = null;
		
        tkn++;
        String tipo ="\""+Integer.toString(tkn)+"_TIPO\"";
        RESULT=tipo;
        tkn++;
        System.out.println(tipo+"->\""+Integer.toString(tkn)+"_String\";\n");
    
              CUP$Parser$result = new java_cup.runtime.Symbol(9/*tipo*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // tipo ::= INT 
            {
              Object RESULT = null;
		
        tkn++;
        String tipo ="\""+Integer.toString(tkn)+"_TIPO\"";
        RESULT=tipo;
        tkn++;
        System.out.println(tipo+"->\""+Integer.toString(tkn)+"_int\";\n");
        
    
              CUP$Parser$result = new java_cup.runtime.Symbol(9/*tipo*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicios ::= tipo listaid PCOMA 
            {
              Object RESULT = null;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object tipo = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int listaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int listaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object lista = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
        tkn++;
        String pts="\"gramatica\" -> \""+Integer.toString(tkn)+"_asignacion\";\n";
        pts+="\""+Integer.toString(tkn)+"_asignacion\" -> "+tipo+";\n";
        pts+="\""+Integer.toString(tkn)+"_asignacion\" -> "+lista+";\n";
        System.out.println(pts);
        load.agregarNodo(pts);
    
              CUP$Parser$result = new java_cup.runtime.Symbol(1/*inicios*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicios ::= inicios tipo listaid PCOMA 
            {
              Object RESULT = null;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object tipo = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int listaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int listaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object lista = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		  
        tkn++;
        String pts="\"gramatica\" -> \""+Integer.toString(tkn)+"_asignacion\";\n";
        pts+="\""+Integer.toString(tkn)+"_asignacion\" -> "+tipo+";\n";
        pts+="\""+Integer.toString(tkn)+"_asignacion\" -> "+lista+";\n";
        System.out.println(pts);
        load.agregarNodo(pts);
    
              CUP$Parser$result = new java_cup.runtime.Symbol(1/*inicios*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicios EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

