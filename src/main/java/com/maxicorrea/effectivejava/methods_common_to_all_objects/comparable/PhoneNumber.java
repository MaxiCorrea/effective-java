package com.maxicorrea.effectivejava.methods_common_to_all_objects.comparable;
/**
 * 
 * @author maximiliano
 *
 */
public class PhoneNumber implements Comparable<PhoneNumber>{

	private final Short areaCode;
	private final Short prefix;
	private final Short lineNum;
	
	public PhoneNumber(
			final Short areaCode ,
			final Short prefix ,
			final Short lineNum) {
		this.areaCode = rangeCheck(areaCode, 999, "area code");
		this.prefix = rangeCheck(prefix, 999, "prefix");
		this.lineNum = rangeCheck(lineNum, 9999, "line num");
	}
	
	private static short rangeCheck(int val, int max, String arg) {
		if (val < 0 || val > max)
			throw new IllegalArgumentException(arg + ": " + val);
		return (short) val;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaCode == null) ? 0 : areaCode.hashCode());
		result = prime * result + ((lineNum == null) ? 0 : lineNum.hashCode());
		result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (areaCode == null) {
			if (other.areaCode != null)
				return false;
		} else if (!areaCode.equals(other.areaCode))
			return false;
		if (lineNum == null) {
			if (other.lineNum != null)
				return false;
		} else if (!lineNum.equals(other.lineNum))
			return false;
		if (prefix == null) {
			if (other.prefix != null)
				return false;
		} else if (!prefix.equals(other.prefix))
			return false;
		return true;
	}
	
	@Override 
	public String toString() {
		return String.format("%03d-%03d-%04d",areaCode, prefix, lineNum);
	}

	@Override
	public int compareTo(PhoneNumber o) {
		int result = Short.compare(areaCode, o.areaCode);
		if(result != 0)
			return result;
		result = Short.compare(prefix,o.prefix);
		if(result != 0)
			return result;
		result = Short.compare(lineNum, o.lineNum);
		return result;
	}
	
}
