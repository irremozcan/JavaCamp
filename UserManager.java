
public class UserManager {

		public void add(User user) {
			System.out.println("Kullan�c� EKLEND�! "+ user.getName()+" "+user.getLastName());
			
		}
		
		public void delete(User user) {
			System.out.println("Kullan�c� S�L�ND�! "+user.getName()+ " "+user.getLastName());
		}
}
