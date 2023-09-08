package scenario4;




public class Scenario4 {
	public static void main(String[] args) {		
	
		    
		        String S1 = ("Objects 8"); // Replace this with your actual string	
		        
		        S1 = S1.replaceAll("[^0-9]", "");

		        System.out.println(S1);
		        String S2=("8 object");	
		        S2=S2.replaceAll("[^0-9]", "");
		        System.out.println(S2);
		        // Uncomment the following lines if you want to parse S1 as an integer
		        /*
		        int itemCount1 = Integer.parseInt(S1);
		        System.out.println(itemCount1);
		        */
	}	
}
		
		
			
//		String S1 = "(Objects 8)";
//		String S2 = "(8 Objects)";
//
//		// Regular expression pattern to match an integer
//		Pattern pattern = Pattern.compile("\\b\\d+\\b");
//
//		// Extract the integer from S1
//		Matcher matcher1 = pattern.matcher(S1);
//		if (matcher1.find()) {
//			int integerFromS1 = Integer.parseInt(matcher1.group());
//			System.out.println("Integer from S1: " + integerFromS1);
//		} else {
//			System.out.println("No integer found in S1");
//		}
//
//		// Extract the integer from S2
//		Matcher matcher2 = pattern.matcher(S2);
//		if (matcher2.find()) {
//			int integerFromS2 = Integer.parseInt(matcher2.group());
//			System.out.println("Integer from S2: " + integerFromS2);
//		} else {
//			System.out.println("No integer found in S2");
//		}
//	}
//}

//	public static void main(String[] args) {
//
//		String S1 = "(Objects 8)";
//
//		String S2 = "(8 Objects)";
//
//		// Regular expression pattern to match an integer
//
//		Pattern pattern = Pattern.compile("\\d+");
//
//		// Extract the integer and remaining string from S1
//
//		Matcher matcher1 = pattern.matcher(S1);
//
//		if (matcher1.find()) {
//
//			String integerStr = matcher1.group();
//
//			int integerFromS1 = Integer.parseInt(integerStr);
//
//			String remainingString1 = S1.replaceAll(integerStr, "").trim();
//
//			System.out.println("Integer from S1: " + integerFromS1);
//
//			System.out.println("Remaining string from S1: " + remainingString1);
//
//		} else {
//
//			System.out.println("No integer found in S1");
//
//		}
//
//		// Extract the integer and remaining string from S2
//
//		Matcher matcher2 = pattern.matcher(S2);
//
//		if (matcher2.find()) {
//
//			String integerStr = matcher2.group();
//
//			int integerFromS2 = Integer.parseInt(integerStr);
//
//			String remainingString2 = S2.replaceAll(integerStr, "").trim();
//
//			System.out.println("Integer from S2: " + integerFromS2);
//
//			System.out.println("Remaining string from S2: " + remainingString2);
//
//		} else {
//
//			System.out.println("No integer found in S2");
//
//		}
//

