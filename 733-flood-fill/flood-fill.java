class Solution {

    int row;
    int col;
    int oldColor;
    int newColor;

    private boolean validPixel(int[][] image, int sr, int sc) {

        if(sr < 0 || sr >= row || sc < 0 || sc >= col || image[sr][sc] != oldColor) return false;

        return true;
    }

    private void defRec(int[][] image, int sr, int sc){
    image[sr][sc] = newColor;

    if (validPixel(image, sr+1, sc)){
        defRec(image, sr+1, sc);
    } 

    if (validPixel(image, sr-1, sc)){
        defRec(image, sr-1, sc);
    }

    if (validPixel(image, sr, sc+1)){
        defRec(image, sr, sc+1);
    }

    if (validPixel(image, sr, sc-1)){
        defRec(image, sr, sc-1);
    }

    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        row = image.length;
        col = image[0].length;
        oldColor = image[sr][sc];
        newColor = color;

        if(oldColor == newColor) return image; 

        defRec(image, sr, sc);
        return image;
    }
}