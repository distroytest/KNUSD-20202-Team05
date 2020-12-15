public class LoginModel {
	public static String id = "abcd";
	public static String pw = "1234";
	
	public static boolean login(String id, String pw) {
		if (LoginModel.id.equals(id) && LoginModel.pw.equals(pw)) {		
			return true;
		} else {
			return false;
		}
	}
}