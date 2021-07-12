package introducao;

public class Cachorro  extends Pet{
		private boolean latidolto;

		public Cachorro(String porte, boolean pelagem, String raca, boolean latidolto) {
			super(porte, pelagem, raca);
			this.latidolto = latidolto;
		}

		public boolean isLatidolto() {
			return latidolto;
		}

		public void setLatidolto(boolean latidolto) {
			this.latidolto = latidolto;
		}
		
		@Override
		public void emitesom() {
			System.out.println("Au au au...");
		}
}
