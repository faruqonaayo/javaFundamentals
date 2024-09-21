package Arrays;

public class StringBufferAndStringBuilderExample {
	public static void main(String[] args) {
		StringBuffer bufffer = new StringBuffer("Hello");
		System.out.println(bufffer.capacity());
		System.out.println(bufffer);
		bufffer.append(" World!");
		System.out.println(bufffer);

		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder.capacity());
		System.out.println(builder);
		builder.append(" World!");
		System.out.println(builder);

	}
}