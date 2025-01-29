
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.1.0
 * Generated source version: 4.1.0
 */

@WebFault(name = "MultipleTopicsSpecifiedFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class MultipleTopicsSpecifiedFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.MultipleTopicsSpecifiedFaultType faultInfo;

    public MultipleTopicsSpecifiedFault() {
        super();
    }

    public MultipleTopicsSpecifiedFault(String message) {
        super(message);
    }

    public MultipleTopicsSpecifiedFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public MultipleTopicsSpecifiedFault(String message, org.oasis_open.docs.wsn.b_2.MultipleTopicsSpecifiedFaultType multipleTopicsSpecifiedFault) {
        super(message);
        this.faultInfo = multipleTopicsSpecifiedFault;
    }

    public MultipleTopicsSpecifiedFault(String message, org.oasis_open.docs.wsn.b_2.MultipleTopicsSpecifiedFaultType multipleTopicsSpecifiedFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = multipleTopicsSpecifiedFault;
    }

    public org.oasis_open.docs.wsn.b_2.MultipleTopicsSpecifiedFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
