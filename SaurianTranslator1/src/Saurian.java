// Taylor Kelly 
// Date : November 6, 2018
// Description : This program has the ability to translate English to Saurian and Saurian to English 

public class Saurian {
    
    private String eng;
    private String saur;

    public static final char[] ENGLISHARR = {'A','B','C','D','E','F','G','H','I','J','K',
        'L','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f',
        'g','h','i','j','k','l','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    
    public static final char[] SAURIANARR = {'U','R','S','T','O','V','W','X','A','Z','B',
        'C','D','E','F','G','H','J','K','I','L','N','P','O','Q','u','r','s','t','o','v',
        'w','x','a','z','b','c','d','e','f','g','h','j','k','i','l','n','p','o','q'};
    
    public static final int ARRLENGTH = ENGLISHARR.length; 
    
    public Saurian()
    {
        saur = "";
        eng = "";
    }
    
    public Saurian(String str, boolean isEng)
    {
        if (isEng)
        {
             eng = str; 
             translateEngToSaur(str); 
        } else 
        {
            saur = str;
            translateSaurToEng(str);
        }
    }
    
    public String getEnglish()
    {
        return eng;
    }
    
    public String getSaurian()
    {
        return saur; 
    }
    
    public void setEnglish(String newEng)
    {
        eng = newEng;
        translateEngToSaur(newEng); 
    }
    
    public void setSaurian(String newSaur)
    {
        saur = newSaur; 
        translateSaurToEng(newSaur);
    }
    
    public void translateSaurToEng(String str)
    { 
        String buildStr = ""; 
        saur = str; 
        
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < ARRLENGTH; j++)
            {
                if (str.charAt(i) == (SAURIANARR[j]))
                {
                    buildStr += ENGLISHARR[j];
                    break;
                } 
                else if (j >= ARRLENGTH - 1)
                {
                    buildStr += str.charAt(i);
                }
            }
        }
        
        eng = buildStr; 
        
    }
   
    public void translateEngToSaur(String str)
    {
        String buildStr = "";
        eng = str;
         
        
        for (int i = 0; i < str.length(); i++)
        {
             for (int j = 0; j < ARRLENGTH; j++)
             {
                 if (str.charAt(i) == (ENGLISHARR[j]))
                 {
                    buildStr += SAURIANARR[j];
                    break; 
                 }
                 else if (j >= ARRLENGTH - 1)
                 {
                    buildStr += str.charAt(i);        
                 } 
         
             }
              
        } 
        saur = buildStr; 
    }

   
    
    
    
    
    
}
