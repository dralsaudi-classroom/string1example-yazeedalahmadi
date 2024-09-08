package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
     public boolean isEqual(String1 s) {
        if (this.length() != s.length()) {
            return false;
        }

        for (int i = 0; i < this.length(); i++) {
            if (this.getChar(i) != s.getChar(i)) {
                return false;
            }
        }

        return true;
    }
	public void reverse() {
        int start = 0;
        int end = size;

        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
    }
}
