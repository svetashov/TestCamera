package com.example.user.testcamera;


public class Post {

    private String message;
    private int[][] matrix;

    public Post(String message, int[][] array) {
        this.message = message;
        this.matrix = array;
    }

    public String getMessage() {
        return message;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}