package sample;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.documents.BookmarksNavigator;

public class Contract {
    void createContract(String name, String civil_ID, String familyNum, String Residence, String position, String address, String phoneNo, String workerName, String workerDOB, String passNo){
        Document doc = new Document("C:\\Users\\vk0t\\Desktop\\ContractApp\\src\\sample\\Contracts\\c1.doc");

        BookmarksNavigator bookmarkNavigator = new BookmarksNavigator(doc);
        bookmarkNavigator.moveToBookmark("name");
        bookmarkNavigator.replaceBookmarkContent(name, false);

        bookmarkNavigator.moveToBookmark("civilID");
        bookmarkNavigator.replaceBookmarkContent(civil_ID, false);

        bookmarkNavigator.moveToBookmark("familyNumber");
        bookmarkNavigator.replaceBookmarkContent(familyNum, false);

        bookmarkNavigator.moveToBookmark("tyoeOfResidence");
        bookmarkNavigator.replaceBookmarkContent(Residence, false);

        bookmarkNavigator.moveToBookmark("position");
        bookmarkNavigator.replaceBookmarkContent(position, false);

        bookmarkNavigator.moveToBookmark("homeAddress");
        bookmarkNavigator.replaceBookmarkContent(address, false);

        bookmarkNavigator.moveToBookmark("phoneNumber");
        bookmarkNavigator.replaceBookmarkContent(phoneNo, false);

        bookmarkNavigator.moveToBookmark("nameOfWorker");
        bookmarkNavigator.replaceBookmarkContent(workerName, false);

        bookmarkNavigator.moveToBookmark("dateOfBirthOfWorker");
        bookmarkNavigator.replaceBookmarkContent(workerDOB, false);

        bookmarkNavigator.moveToBookmark("HolderOfPassportNumber");
        bookmarkNavigator.replaceBookmarkContent(passNo, false);

        doc.getBookmarks().remove(bookmarkNavigator.getCurrentBookmark());

        doc.saveToFile("C:\\Users\\BlaCko\\Desktop\\ContractApp\\src\\sample\\Contracts\\c2.doc", FileFormat.Doc);
    }
}
