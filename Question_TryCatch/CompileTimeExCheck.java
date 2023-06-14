package Question_TryCatch;

import java.sql.SQLException;

class CMP{
    public void met() throws SQLException
    {
        System.out.println("Siuuu");
        throw new SQLException("invalid");
    }
}


public class CompileTimeExCheck
{
    public static void main(String[] args) {
        CMP c = new CMP();

        try{
            c.met();
        }
        catch (SQLException e){
            System.out.println("SQL Exception found");
        }
    }
}
