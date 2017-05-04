public interface interpreterNeededMethods {
		public int interpret();	//interpret the kode
		public int compiles();	//does the kode compile
								//int returned is line on which compilation failed, -1 for no failure
}
