package class18;




public class AccessModifiers {



        public String name;
        private String BankAccountPassword;
        String SSN;

        public void accessToPart () {
            System.out.println("Everyone can go");
        }

        void car() {
            System.out.println("My little brother you can have my car please be careful");
        }

        private void toothBrush() {
            System.out.println("No one can have access");
        }

        void printInfo () {
            System.out.println(name);
            System.out.println(BankAccountPassword);
            System.out.println(SSN);
        }

}
