package bank;
/***
 * Model a bank corporation like 5/3rd
 * @author mark
 *
 */
public class Bank {
	private String bankName;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String toString() {
		return "Bank Name = " + bankName;
	}
}
