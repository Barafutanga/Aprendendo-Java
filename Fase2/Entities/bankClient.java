package Entities;
public class bankClient {
    
    
    private String username;
    private int userNum;
    private double userMoney;
   
    
    public bankClient(String username, double firstDeposit, int userNum) {
        this.username = username;
        deposit(firstDeposit);
        this.userNum = userNum;
    }
    public bankClient(String username, int userNum) {
        this.username = username;
        this.userNum = userNum;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getUserNum() {
        return userNum;
    }
    public double getUserMoney() {
        return userMoney;
    }
       
    //depósito na conta
    public void deposit(Double amount) {
        this.userMoney += amount;
    }
    //retirada na conta
    public void withdraw(Double amount) {
        this.userMoney -= amount +5;
    }    
    //geração de número da conta
    public double setUserNum(int userNum) {
        return this.userNum = (int) Math.random() * 9999; 
    }

    public String toString() {
        return "USER SERIAL:" + userNum
        + "USERNAME: " 
        + username
        + "MY MONEY: "
        + userMoney;        
    }
}
