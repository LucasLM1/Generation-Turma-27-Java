package introducao;

public class Pet {
		private String porte;
		private boolean pelagem;
		private String raca;
		
		public Pet(String porte, boolean pelagem, String raca) {
			super();
			this.porte = porte;
			this.pelagem = pelagem;
			this.raca = raca;
			
		}

		public String getPorte() {
			return porte;
		}

		public void setPorte(String porte) {
			this.porte = porte;
		}

		public boolean isPelagem() {
			return pelagem;
		}

		public void setPelagem(boolean pelagem) {
			this.pelagem = pelagem;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}
		public void emitesom() {
			System.out.println("Emitindo som...");
		}
		
}
