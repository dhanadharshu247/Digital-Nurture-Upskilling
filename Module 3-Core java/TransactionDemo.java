import java.sql.*;

public class TransactionDemo {

    public static void transfer(
        Connection con,
        int from,
        int to,
        double amount
    ) throws Exception {

        try {

            con.setAutoCommit(false);

            PreparedStatement debit =
                con.prepareStatement(
                    "UPDATE accounts SET balance=balance-? WHERE id=?");

            debit.setDouble(1,amount);
            debit.setInt(2,from);
            debit.executeUpdate();

            PreparedStatement credit =
                con.prepareStatement(
                    "UPDATE accounts SET balance=balance+? WHERE id=?");

            credit.setDouble(1,amount);
            credit.setInt(2,to);
            credit.executeUpdate();

            con.commit();

            System.out.println("Transfer Successful");

        } catch(Exception e) {

            con.rollback();

            System.out.println("Transaction Rolled Back");
        }
    }

    public static void main(String[] args)
            throws Exception {

        Connection con =
            DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/school",
                "root",
                "password"
            );

        transfer(con,1,2,1000);
    }
}
