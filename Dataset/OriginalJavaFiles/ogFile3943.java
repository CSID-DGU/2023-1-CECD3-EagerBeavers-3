import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.math.BigInteger;
import java.util.Iterator;
import java.io.*;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collection;

/**
 * Generated by Contest helper plug-in
 * Actual solution is at the bottom
 */
public class Main {
	public static void main(String[] args) {
		InputReader in = new StreamInputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		run(in, out);
	}

	public static void run(InputReader in, PrintWriter out) {
		Solver solver = new TaskC();
		solver.solve(1, in, out);
		Exit.exit(in, out);
	}
}

abstract class InputReader {
	private boolean finished = false;

	public abstract int read();

	public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuffer res = new StringBuffer();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	private boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public abstract void close();
}

class StreamInputReader extends InputReader {
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar, numChars;

	public StreamInputReader(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public void close() {
		try {
			stream.close();
		} catch (IOException ignored) {
		}
	}
}

class Exit {
	private Exit() {
	}

	public static void exit(InputReader in, PrintWriter out) {
		in.setFinished(true);
		in.close();
		out.close();
	}
}

interface Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out);
}

class ArrayUtils {

	public static void fill(int[][] array, int value) {
		for (int[] row : array)
			Arrays.fill(row, value);
	}

	public static void fill(int[][][] array, int value) {
		for (int[][] subArray : array)
			fill(subArray, value);
	}

	}

class TaskC implements Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		int rowCount = in.readInt();
		int columnCount = in.readInt();
		out.println(rowCount * columnCount - go(Math.min(rowCount, columnCount), Math.max(rowCount, columnCount)));
	}

	private int go(int rowCount, int columnCount) {
		int[][][] result = new int[columnCount][rowCount][1 << (2 * rowCount)];
		ArrayUtils.fill(result, -1);
		return go(0, 0, (1 << rowCount) - 1, result);
	}

	private int go(int column, int row, int mask, int[][][] result) {
		if (column == result.length)
			return (mask == 0 ? 0 : Integer.MAX_VALUE / 2);
		int length = result[column].length;
		if (row == length)
			return go(column + 1, 0, mask, result);
		if (result[column][row][mask] != -1)
			return result[column][row][mask];
		result[column][row][mask] = Integer.MAX_VALUE / 2;
		if ((mask >> (2 * length - 1) & 1) == 0)
			result[column][row][mask] = go(column, row + 1, mask * 2 + (column == result.length - 1 ? 0 : 1), result);
		int newMask = mask;
		newMask &= ~(1 << (length - 1));
		if (row != 0)
			newMask &= ~(1 << length);
		if (row != length - 1)
			newMask &= ~(1 << (length - 2));
		newMask *= 2;
		newMask &= (1 << (2 * length)) - 1;
		return result[column][row][mask] = Math.min(result[column][row][mask], 1 + go(column, row + 1, newMask, result));
	}
}
