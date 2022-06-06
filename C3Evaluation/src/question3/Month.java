package question3;

public enum Month {
	
	JAN{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"st Month of the Year January");
		}
	},FEB{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"nd Month of the Year February");
		}
	},MAR{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"rd Month of the Year March");
		}
	},APR{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"th Month of the Year April");
		}
	},MAY{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"th Month of the Year May");
		}
	},JUN{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"th Month of the Year June");
		}
	},JUL{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"th Month of the Year July");
		}
	},AUG{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"th Month of the Year August");
		}
	},SEP{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"th Month of the Year September");
		}
	},OCT{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"th Month of the Year October");
		}
	},NOV{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"th Month of the Year November");
		}
	},DEC{
		@Override
		public void info(int index){
			System.out.println("This is the "+index+"th Month of the Year December");
		}
	};
	
	public void info(int index){
		System.out.println("This is the"+index+"Month of the Year"+this);
	}
}
