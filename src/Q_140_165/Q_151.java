package Q_140_165;

public class Q_151 {}

    class Customer {

        ElectricAccount acct=new ElectricAccount();
        public void useElectricity(double kWh) {
            acct.addKWh(kWh);
        }

        public static void main(String[] args) {
            Customer obj = new Customer();
            obj.useElectricity(5);
        }
    }

    class ElectricAccount{
        private double kWh;
        private double rate=0.07;
        private double bill;
        //	public void addKWh(double kWh) {
    //		if(kWh>0) {
    //			this.kWh+=kWh;
    //			this.bill= this.kWh*this.rate;
    //		}
    //
    //	}
        public void addKWh(double kWh){
            if(kWh>0){
                this.kWh +=kWh;
                setBill(this.kWh);
            }
        }
        public void setBill(double kWh){
            bill = kWh*rate;
            System.out.println(bill);
    }
}



