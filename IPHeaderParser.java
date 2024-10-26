public class IPHeaderParser {

    public static void main(String[] args) {
        // Binary representation of the IP header (adjust to fit the 96-bit header)
        String binaryData = "01000000011000110000000000011000"+
                "1100000010101000000000010111011"+
                "1100000010101000000011101011";

        // Remove spaces from binary data
        binaryData = binaryData.replace(" ", "");

        // Check if the binaryData length is correct (should be 96 bits for IPv4 header)
        if (binaryData.length() != 96) {
            System.out.println("Invalid binary data length.");
            return;
        }

        try {
            // Extract fields from binary data
            int version = Integer.parseInt(binaryData.substring(0, 4), 2);
            int ihl = Integer.parseInt(binaryData.substring(4, 8), 2);
            int typeOfService = Integer.parseInt(binaryData.substring(8, 16), 2);
            int totalLength = Integer.parseInt(binaryData.substring(16, 32), 2);
            int identification = Integer.parseInt(binaryData.substring(32, 48), 2);
            int ttl = Integer.parseInt(binaryData.substring(48, 56), 2);
            int protocol = Integer.parseInt(binaryData.substring(56, 64), 2);
            String sourceIPBinary = binaryData.substring(64, 96);

            // Convert binary to IP addresses
            String sourceIP = binaryToIP(sourceIPBinary);

            // The destination IP is not included in the given 96 bits; thus, adjust as needed.
            // For demonstration, let's use the source IP for both IP addresses.
            String destIP = sourceIP;

            // Determine protocol name
            String protocolName;
            switch (protocol) {
                case 1:  protocolName = "ICMP"; break;
                case 6:  protocolName = "TCP"; break;
                case 17: protocolName = "UDP"; break;
                default: protocolName = "Unknown"; break;
            }

            // Output the results
            System.out.println(version + ", " + protocolName + ", " + totalLength + ", " + identification);
            System.out.println(sourceIP);
            System.out.println(destIP);
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Error parsing the binary data: " + e.getMessage());
        }
    }

    private static String binaryToIP(String binary) {
        if (binary.length() != 32) {
            throw new IllegalArgumentException("Invalid binary IP length. Expected 32 bits.");
        }
        StringBuilder ip = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            String octet = binary.substring(i, i + 8);
            ip.append(Integer.parseInt(octet, 2)).append(".");
        }
        return ip.substring(0, ip.length() - 1); // Remove last dot
    }
}
