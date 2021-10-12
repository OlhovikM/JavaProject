package javaproject;
 class Member {
     private char memberType;
     private int memberID;
     private String name;
     private double fees;

       public Member (char pMemberType, int pMemberID, String pName, double pFees){
         pMemberType = memberType;
         System.out.println("\n" + memberType);
         System.out.println("--------------------------");
         pMemberID = memberID;
         System.out.println("\n" + memberID);
         System.out.println("--------------------------");
         pName = name;
         System.out.println("\n" + name);
         System.out.println("--------------------------");
         pFees = fees;
         System.out.println("\n" + fees);
         System.out.println("--------------------------");
     }

     public void setMemberType(char pMemberType)
     {
         memberType = pMemberType;
     }
     public char getMemberType()
     {
         return memberType;
     }
     public void setMemberID(int pMemberID)
     {
         memberID = pMemberID;
     }
     public int getMemberID()
     {
         return memberID;
     }
     public void setName( String pName)
     {
         name = pName;
     }
     public String getName()
     {
         return name;
     }
     public void setFees(double pFees)
     {
         fees = pFees;
     }
     public double getFees()
     {
         return fees;
     }
     @Override
     public String toString(){
         return memberType + ", " + memberID + " " + name + " " + fees;
     }
}
