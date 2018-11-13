/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engineer;

/**
 *
 * @author Jamil Francisco
 */
public class addProjectclass {

    private int id;
    private String DOA;
    private String date;
    private String approval;
    private String CIN;
    private String NOP;
    private String SOF;
    private String location;
    private String subject;
    private String ContractID;
    private String DE;
    private String ADE;
    private String CCS;
    private String PE;
    private String PI;
    private String OC;
    private String contractor;
    private String CN;
    private String CA;
    
    public addProjectclass(int id,String DOA,String date,String approval,String CIN, String NOP,String SOF,String location, String subject, String ContractID, String DE,String ADE,String CCS,String PE,String PI, String OC, String contractor, String CN,String CA){
        this.id = id;
        this.date = date;
        this.DOA = DOA;
        this.approval = approval;
        this.CIN = CIN;
        this.NOP = NOP;
        this.SOF = SOF;
        this.location = location ; 
        this.subject = subject;
        this.ContractID = ContractID;
        this.DE = DE;
        this.ADE = ADE;
        this.CCS = CCS;
        this.PE = PE;
        this.PI = PI;
        this.OC = OC;
        this.contractor = contractor;
        this.CN = CN;
        this.CA = CA;
 }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the DOA
     */
    public String getDOA() {
        return DOA;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the approval
     */
    public String getApproval() {
        return approval;
    }

    /**
     * @return the CIN
     */
    public String getCIN() {
        return CIN;
    }

    /**
     * @return the NOP
     */
    public String getNOP() {
        return NOP;
    }

    /**
     * @return the SOF
     */
    public String getSOF() {
        return SOF;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @return the ContractID
     */
    public String getContractID() {
        return ContractID;
    }

    /**
     * @return the DE
     */
    public String getDE() {
        return DE;
    }

    /**
     * @return the ADE
     */
    public String getADE() {
        return ADE;
    }

    /**
     * @return the CCS
     */
    public String getCCS() {
        return CCS;
    }

    /**
     * @return the PE
     */
    public String getPE() {
        return PE;
    }

    /**
     * @return the PI
     */
    public String getPI() {
        return PI;
    }

    /**
     * @return the OC
     */
    public String getOC() {
        return OC;
    }

    /**
     * @return the contractor
     */
    public String getContractor() {
        return contractor;
    }

    /**
     * @return the CN
     */
    public String getCN() {
        return CN;
    }

    /**
     * @return the CA
     */
    public String getCA() {
        return CA;
    }
}
