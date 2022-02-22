package Entity;

public class Person {

    public Person() {
    }

    public class Wallet {
        private int walletValue;

        public Wallet() {
        }

        public Wallet(int walletValue) {
            this.walletValue = walletValue;
        }

        public int getWalletValue() {
            return walletValue;
        }

        public void setWalletValue(int walletValue) {
            this.walletValue = walletValue;
        }

        public boolean payMoney(int total) {
            return getWalletValue() >= total;
        }
    }

}
