package RealInterview;

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public Path cd(String newPath) {

        if(null == newPath) {
            throw new IllegalArgumentException("The input can't be null");
        }

        if (newPath.trim() == "") {
            throw new IllegalArgumentException("Name has no content.");
        }

        String[] newPathToken = newPath.split("/");
        int count = 0;
        boolean isRelativePath = false;
        for( String str: newPathToken) {
            if(!str.matches("[a-zA-Z0-9]+")){
                throw new IllegalArgumentException("The path has to contain only characters or numbers");
            }
            if(str.equals("..")){
                count++;
                isRelativePath = true;
            }

        }


        String strOut = "";
        if (isRelativePath){
            String[] oldPathToken = path.split("/");
            // Get the same part from the old path
            int length = oldPathToken.length;
            for(int i=0; i<length-count; i++) {
                strOut=strOut+oldPathToken[i]+"/";
            }


            // Change the path according to the new path
            length = newPathToken.length;
            for(int i=0; i<length; i++){
                if(!newPathToken[i].equals("..")){
                    strOut=strOut+newPathToken[i]+"/";
                }
            }

            // Remove the last slash / from the string
            path = strOut.substring(0, strOut.length()-1);

        } else {
            // the path is absolute
            path=newPath;
        }

        if(path.indexOf("/")<0){
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        return this;


    }

}