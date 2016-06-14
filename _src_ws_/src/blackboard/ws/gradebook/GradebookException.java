
/**
 * GradebookException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package blackboard.ws.gradebook;

public class GradebookException extends java.lang.Exception{

    private static final long serialVersionUID = 1465944117562L;
    
    private blackboard.ws.gradebook.GradebookWSStub.GradebookExceptionE faultMessage;

    
        public GradebookException() {
            super("GradebookException");
        }

        public GradebookException(java.lang.String s) {
           super(s);
        }

        public GradebookException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GradebookException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(blackboard.ws.gradebook.GradebookWSStub.GradebookExceptionE msg){
       faultMessage = msg;
    }
    
    public blackboard.ws.gradebook.GradebookWSStub.GradebookExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    