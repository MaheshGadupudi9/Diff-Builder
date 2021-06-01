package co.za.javers.diff;

/**
 * @author mahesh gadupudi
 * @project adaptris-regulatory-compliance
 */
public class SuggestBoxTest {

    public static void main(String[] args) {
        SuggestionBox officeSuggestionBox = new SuggestionBox() {
            public void onSelection(){
                System.out.println("office selected");
            }

            public void onRemoveSelection(){
                onSelection();
                System.out.println("office removed");
            }
        };

        officeSuggestionBox.onRemoveSelection();

    }

}


class SuggestionBox{
    private void onSelection(){
        System.out.println("Item selected");
    }

    public void onRemoveSelection(){
        System.out.println("Item removed");
    }
}


