package task;


	enum Region {
	    R1("USA", 0.1),
	    R2("Europe", 0.15),
	    R3("Asia", 0.2),
	    R4("Africa", 0.25);

	    private final String continent;
	    private final double taxRate;

	    Region(String continent, double taxRate) {
	        this.continent = continent;
	        this.taxRate = taxRate;
	    }

	    public double getTaxRate() {
	        return taxRate;
	    }
	}

