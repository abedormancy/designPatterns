package prototype;

/**
 * Created by abedormancy@gmail.com on 2018/3/11.
 */
public class PackageInfo implements Cloneable {

    private Long id;
    private String receiverName;
    private String receiverAddress;
    private String senderName;
    private String senderPhoneNo;


    public PackageInfo clone() {
        try {
            return (PackageInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static PackageInfo clonePackage(String username) {
        // load package as prototype data from db...
        PackageInfo prototype = loadPackageInfo(username);

        // clone information
        prototype = prototype.clone();

        // initialize copied data...
        prototype.setId(null);
        return prototype;
    }

    private static PackageInfo loadPackageInfo(String username) {
        PackageInfo packageInfo = new PackageInfo();

        // create a String object in jvm heap not jvm string pool
        packageInfo.setId(100l);
        packageInfo.setReceiverName("John");
        packageInfo.setReceiverAddress("People Square, Shanghai");
        packageInfo.setSenderName("William");
        packageInfo.setSenderPhoneNo("12345678901");
        return packageInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPhoneNo() {
        return senderPhoneNo;
    }

    public void setSenderPhoneNo(String senderPhoneNo) {
        this.senderPhoneNo = senderPhoneNo;
    }
}
