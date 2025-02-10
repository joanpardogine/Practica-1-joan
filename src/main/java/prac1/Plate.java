package prac1;


// PLATE = (PLACA DE) MATRICULA

public class Plate implements Comparable, Cloneable {

	private static final int MIN_AREA_CODE = 1;
	private static final int MAX_AREA_CODE = 6;

	private int areaCode;
	private String prefix;
	private String suffix;

	public Plate (int areaCode, String prefix, String suffix) {
		checkParams(areaCode, prefix, suffix);
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public boolean checkParams (int areaCode, String prefix, String suffix) {
		/* Check that the parameters are correct. Return an exception if any parameter is incorrect
		   - areCode must be between MIN_AREA_CODE and MAX_AREA_CODE
		   - prefix is a String but the content is really a number with only 4 digits
		   - suffix must be all letters, no numbers and only of 3 letters
        */
		/* COMPLETE */
	}

	@Override
	public int compareTo (Object other) {
        /* this is how plates are sorted:
        first go plates with lower area codes. If they have the same area code...
        ... first go plates with a lower prefix. If the have the same prefix...
        ... first go plates with a lower suffix.
        */

		/* COMPLETE */
	}

	@Override
	public boolean equals (Object other) {
		/* COMPLETE */
	}
}
