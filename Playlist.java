import java.util.ArrayList;
import java.util.Scanner;

class Playlist {

  public static void main(String[] args) {
    // Create an ArrayList to store the songs
    ArrayList<String> favPlaylist = new ArrayList<String>();

    // Create a Scanner object to read user input
    Scanner keyboard = new Scanner(System.in);

    // Prompt the user to input their first 5 favorite songs
    System.out.println("Enter your first five favorite songs:");
    for (int i = 0; i < 5; i++) {
      String song = keyboard.nextLine();
      favPlaylist.add(song);
    }

    // Print the desertIslandPlaylist
    System.out.println("Desert Island Playlist: " + favPlaylist);

    // Prompt the user to choose an action
    System.out.println("What would you like to do? (add/delete/move/quit)");

    // Loop until the user chooses to quit
    boolean quit = false;
    while (!quit) {
      String action = keyboard.nextLine();
      
      switch (action) {
        case "add":
          System.out.print("Enter the song you want to add: ");
          String newSong = keyboard.nextLine();
          favPlaylist.add(newSong);
          System.out.println("Updated Playlist: " + favPlaylist);
          break;
        case "delete":
          System.out.print("Enter the index of the song you want to delete: ");
          int deleteIndex = keyboard.nextInt();
          keyboard.nextLine(); // Consume the remaining newline character
          if (deleteIndex >= 0 && deleteIndex < favPlaylist.size()) {
            favPlaylist.remove(deleteIndex);
            System.out.println("Updated Playlist: " + favPlaylist);
          } else {
            System.out.println("Invalid index! Please try again.");
          }
          break;
        case "move":
          System.out.print("Enter the index of the song you want to move: ");
          int moveIndex = keyboard.nextInt();
          keyboard.nextLine(); // Consume the remaining newline character
          System.out.print("Enter the new index for the song: ");
          int newIndex = keyboard.nextInt();
          keyboard.nextLine(); // Consume the remaining newline character
          if (moveIndex >= 0 && moveIndex < favPlaylist.size() && newIndex >= 0 && newIndex < favPlaylist.size()) {
            String movedSong = favPlaylist.remove(moveIndex);
            favPlaylist.add(newIndex, movedSong);
            System.out.println("Updated Playlist: " + favPlaylist);
          } else {
            System.out.println("Invalid index! Please try again.");
          }
          break;
        case "quit":
          quit = true;
          System.out.println("Exiting the program...");
          break;
        default:
          System.out.println("Invalid action! Please try again.");
          break;
      }
    }

    // Close the Scanner object
    keyboard.close();
  }

}
