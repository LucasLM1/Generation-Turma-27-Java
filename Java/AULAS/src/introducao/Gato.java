package introducao;

public class Gato extends Pet {
		private boolean miado;

		public Gato(String porte, boolean pelagem, String raca, boolean miado) {
			super(porte, pelagem, raca);
			this.miado = miado;
		}

		public boolean isMiado() {
			return miado;
		}

		public void setMiado(boolean miado) {
			this.miado = miado;
		}
		
		@Override
		public void emitesom() {
			System.out.println("Mial mial mial...");
		}
}
