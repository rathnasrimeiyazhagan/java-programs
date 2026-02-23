import java.util.Scanner;

public class investmentrisk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stock = sc.nextInt();
        sc.nextLine();
        int years = sc.nextInt();
        sc.nextLine();
        String risk = sc.nextLine();
        String volatility = sc.nextLine();

        int bond = 100 - stock;

        int score = stock;
        if (years >= 1 && years <= 5) {
            if (stock > 50) {
                score = score + 20;
            } else {
                score = score;
            }
        } else if (years >= 6 && years <= 10) {
            if (stock > 60) {
                score = score + 10;
            } else {
                score = score;
            }
        } else if (years >= 11 && years <= 20) {
            if (stock > 80) {
                score = score + 5;
            } else {
                score = score;
            }
        } else {
            score = score;
        }

        
        if (volatility.equalsIgnoreCase("Low")) {
            score = score + 0;
        } else if (volatility.equalsIgnoreCase("Medium")) {
            score = score + 10;
        } else if (volatility.equalsIgnoreCase("High")) {
            score = score + 20;
        } else {
            score = score;
        }


        if (score > 100) {
            score = 100;
        } else {
            score = score;
        }

        String riskCat = "";
        if (score >= 0 && score <= 30) {
            riskCat = "Low";
        } else if (score >= 31 && score <= 60) {
            riskCat = "Moderate";
        } else if (score >= 61 && score <= 80) {
            riskCat = "High";
        } else if (score >= 81) {
            riskCat = "Very High";
        } else {
            riskCat = "Moderate";
        }

        String align = "";
        if (risk.equalsIgnoreCase("Conservative")) {
            if (riskCat.equals("Low")) {
                align = "Well Aligned";
            } else if (riskCat.equals("Moderate")) {
                align = "Acceptable";
            } else {
                align = "Misaligned";
            }
        } else if (risk.equalsIgnoreCase("Moderate")) {
            if (riskCat.equals("Moderate")) {
                align = "Well Aligned";
            } else if (riskCat.equals("Low") || riskCat.equals("High")) {
                align = "Acceptable";
            } else {
                align = "Misaligned";
            }
        } else if (risk.equalsIgnoreCase("Aggressive")) {
            if (riskCat.equals("High") || riskCat.equals("Very High")) {
                align = "Well Aligned";
            } else if (riskCat.equals("Moderate")) {
                align = "Acceptable";
            } else {
                align = "Misaligned";
            }
        } else {
            align = "Acceptable";
        }

        String rec = "";
        String reb = "";
        if (align.equals("Well Aligned")) {
            rec = "Portfolio is appropriately balanced for your profile";
            reb = "No action needed";
        } else if (align.equals("Acceptable")) {
            rec = "High risk level acceptable given long horizon and tolerance";
            reb = "Monitor closely, consider slight reduction if volatility persists";
        } else if (align.equals("Misaligned")) {
            if (risk.equalsIgnoreCase("Conservative")) {
                rec = "Portfolio risk significantly exceeds tolerance level";
                reb = "Reduce stocks to 30-40%, increase bonds and cash";
            } else if (risk.equalsIgnoreCase("Aggressive")) {
                rec = "Portfolio is too conservative for your risk tolerance";
                reb = "Increase stocks to 80-90% for better growth potential";
            } else {
                rec = "Portfolio needs adjustment";
                reb = "Review allocation to match risk profile";
            }
        } else {
            rec = "Portfolio needs review";
            reb = "Check allocation";
        }

        System.out.println("Stock Allocation: " + stock + "%");
        System.out.println("Bond Allocation: " + bond + "%");
        System.out.println("Investment Horizon: " + years + " years");
        System.out.println("Risk Tolerance: " + risk);
        System.out.println("Market Volatility: " + volatility);
        System.out.println("Portfolio Risk Score: " + score + "/100");
        System.out.println("Risk Category: " + riskCat);
        System.out.println("Alignment Status: " + align);
        System.out.println("Recommendation: " + rec);
        System.out.println("Suggested Rebalancing: " + reb);

        sc.close();
    }
}