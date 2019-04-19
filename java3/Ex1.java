public class Ex1<T extends Object> {
	private T[] elms;
	
	public Ex1(T[] elms) {
		this.elms = elms;
	}

	void replElm() {
		Object l;
		for (int k = 0; k < elms.length/2; k++) {
			l = elms[0 + k];
			elms[0 + k] = elms[elms.length - 1 - k];
			elms[elms.length -  1 - k] = (T)l;
		}
		for (Object s : elms)
			System.out.print(" " + s);
	}

}