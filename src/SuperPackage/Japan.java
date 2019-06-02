package SuperPackage;

	public class Japan extends Country{
		public Japan() {
			super();
		}
		
		public static void main(String[] args) {
			Japan j = new Japan();
			//j.capital ="Tokyo";
			final int AGE;
			System.out.println("somethig");
			
		}
		public void sakura() {
			super.anthem();
			
		}
		
		@Override
		public void anthem() {
			System.out.println("Anthem method in Country class");
			super.anthem();
			System.out.println("Some extra prints");
		}
		
}
