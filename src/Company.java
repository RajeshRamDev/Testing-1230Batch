public class Company {
    private String companyName;
    protected String location;
    public void showCompanyInfo( String companyName,String location)
    {
       this.companyName = companyName;
       this.location = location;
        System.out.println("Company name: "+companyName+"\tLocation: "+location);
    }

    public static void main(String[] args) {
        Company co = new Company();
        co.showCompanyInfo("ABCD","Chennai");
    }
}
