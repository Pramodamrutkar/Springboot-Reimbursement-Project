package com.reimbursement.rmiproject.constants;

public class CommonConstants {
    public static final String HTML_RECEIPT_BODY = "<html>\n" +
            "<head>\n" +
            "<style>\n" +
            "body{margin-top:20px;\n" +
            "background-color: #f7f7ff;\n" +
            "}\n" +
            "#invoice {\n" +
            "    padding: 0px;\n" +
            "}\n" +
            "\n" +
            ".invoice {\n" +
            "    position: relative;\n" +
            "    background-color: #FFF;\n" +
            "    min-height: 680px;\n" +
            "    padding: 15px\n" +
            "}\n" +
            "\n" +
            ".invoice header {\n" +
            "    padding: 10px 0;\n" +
            "    margin-bottom: 20px;\n" +
            "    border-bottom: 1px solid #0d6efd\n" +
            "}\n" +
            "\n" +
            ".invoice .company-details {\n" +
            "    text-align: right\n" +
            "}\n" +
            "\n" +
            ".invoice .company-details .name {\n" +
            "    margin-top: 0;\n" +
            "    margin-bottom: 0\n" +
            "}\n" +
            "\n" +
            ".invoice .contacts {\n" +
            "    margin-bottom: 20px\n" +
            "}\n" +
            "\n" +
            ".invoice .invoice-to {\n" +
            "    text-align: left\n" +
            "}\n" +
            "\n" +
            ".invoice .invoice-to .to {\n" +
            "    margin-top: 0;\n" +
            "    margin-bottom: 0\n" +
            "}\n" +
            "\n" +
            ".invoice .invoice-details {\n" +
            "    text-align: right\n" +
            "}\n" +
            "\n" +
            ".invoice .invoice-details .invoice-id {\n" +
            "    margin-top: 0;\n" +
            "    color: #0d6efd\n" +
            "}\n" +
            "\n" +
            ".invoice main {\n" +
            "    padding-bottom: 50px\n" +
            "}\n" +
            "\n" +
            ".invoice main .thanks {\n" +
            "    margin-top: -100px;\n" +
            "    font-size: 2em;\n" +
            "    margin-bottom: 50px\n" +
            "}\n" +
            "\n" +
            ".invoice main .notices {\n" +
            "    padding-left: 6px;\n" +
            "    border-left: 6px solid #0d6efd;\n" +
            "    background: #e7f2ff;\n" +
            "    padding: 10px;\n" +
            "}\n" +
            "\n" +
            ".invoice main .notices .notice {\n" +
            "    font-size: 1.2em\n" +
            "}\n" +
            "\n" +
            ".invoice table {\n" +
            "    width: 100%;\n" +
            "    border-collapse: collapse;\n" +
            "    border-spacing: 0;\n" +
            "    margin-bottom: 20px\n" +
            "}\n" +
            "\n" +
            ".invoice table td,\n" +
            ".invoice table th {\n" +
            "    padding: 15px;\n" +
            "    background: #eee;\n" +
            "    border-bottom: 1px solid #fff\n" +
            "}\n" +
            "\n" +
            ".invoice table th {\n" +
            "    white-space: nowrap;\n" +
            "    font-weight: 400;\n" +
            "    font-size: 16px\n" +
            "}\n" +
            "\n" +
            ".invoice table td h3 {\n" +
            "    margin: 0;\n" +
            "    font-weight: 400;\n" +
            "    color: #0d6efd;\n" +
            "    font-size: 1.2em\n" +
            "}\n" +
            "\n" +
            ".invoice table .qty,\n" +
            ".invoice table .total,\n" +
            ".invoice table .unit {\n" +
            "    text-align: right;\n" +
            "    font-size: 1.2em\n" +
            "}\n" +
            "\n" +
            ".invoice table .no {\n" +
            "    color: #fff;\n" +
            "    font-size: 1.6em;\n" +
            "    background: #0d6efd\n" +
            "}\n" +
            "\n" +
            ".invoice table .unit {\n" +
            "    background: #ddd\n" +
            "}\n" +
            "\n" +
            ".invoice table .total {\n" +
            "    background: #0d6efd;\n" +
            "    color: #fff\n" +
            "}\n" +
            "\n" +
            ".invoice table tbody tr:last-child td {\n" +
            "    border: none\n" +
            "}\n" +
            "\n" +
            ".invoice table tfoot td {\n" +
            "    background: 0 0;\n" +
            "    border-bottom: none;\n" +
            "    white-space: nowrap;\n" +
            "    text-align: right;\n" +
            "    padding: 10px 20px;\n" +
            "    font-size: 1.2em;\n" +
            "    border-top: 1px solid #aaa\n" +
            "}\n" +
            "\n" +
            ".invoice table tfoot tr:first-child td {\n" +
            "    border-top: none\n" +
            "}\n" +
            ".card {\n" +
            "    position: relative;\n" +
            "    display: flex;\n" +
            "    flex-direction: column;\n" +
            "    min-width: 0;\n" +
            "    word-wrap: break-word;\n" +
            "    background-color: #fff;\n" +
            "    background-clip: border-box;\n" +
            "    border: 0px solid rgba(0, 0, 0, 0);\n" +
            "    border-radius: .25rem;\n" +
            "    margin-bottom: 1.5rem;\n" +
            "    box-shadow: 0 2px 6px 0 rgb(218 218 253 / 65%), 0 2px 6px 0 rgb(206 206 238 / 54%);\n" +
            "}\n" +
            "\n" +
            ".invoice table tfoot tr:last-child td {\n" +
            "    color: #0d6efd;\n" +
            "    font-size: 1.4em;\n" +
            "    border-top: 1px solid #0d6efd\n" +
            "}\n" +
            "\n" +
            ".invoice table tfoot tr td:first-child {\n" +
            "    border: none\n" +
            "}\n" +
            "\n" +
            ".invoice footer {\n" +
            "    width: 100%;\n" +
            "    text-align: center;\n" +
            "    color: #777;\n" +
            "    border-top: 1px solid #aaa;\n" +
            "    padding: 8px 0\n" +
            "}\n" +
            "\n" +
            "@media print {\n" +
            "    .invoice {\n" +
            "        font-size: 11px !important;\n" +
            "        overflow: hidden !important\n" +
            "    }\n" +
            "    .invoice footer {\n" +
            "        position: absolute;\n" +
            "        bottom: 10px;\n" +
            "        page-break-after: always\n" +
            "    }\n" +
            "    .invoice>div:last-child {\n" +
            "        page-break-before: always\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            ".invoice main .notices {\n" +
            "    padding-left: 6px;\n" +
            "    border-left: 6px solid #0d6efd;\n" +
            "    background: #e7f2ff;\n" +
            "    padding: 10px;\n" +
            "}\n" +
            "</style>\n" +
            "</head>\n" +
            "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\"><script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n" +
            "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n" +
            "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\n" +
            "\n" +
            "<body>\n" +
            "<div class=\"container\">\n" +
            "    <div class=\"card\">\n" +
            "        <div class=\"card-body\">\n" +
            "            <div id=\"invoice\">\n" +
            "                <div class=\"invoice overflow-auto\">\n" +
            "                    <div style=\"min-width: 600px\">\n" +
            "                        <header>\n" +
            "                            <div class=\"row\">\n" +
            "                                <div class=\"col\">\n" +
            "                                    <a href=\"javascript:;\">\n" +
            "    \t\t\t\t\t\t\t\t\t\t\t\t<img src=\"assets/images/logo-icon.png\" width=\"80\" alt=\"\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t</a>\n" +
            "                                </div>\n" +
            "                                <div class=\"col company-details\">\n" +
            "                                    <h2 class=\"name\">\n" +
            "                                        <a target=\"_blank\" href=\"javascript:;\">\n" +
            "\t\t\t\t\t\t\t\t\tArboshiki\n" +
            "\t\t\t\t\t\t\t\t\t</a>\n" +
            "                                    </h2>\n" +
            "                                    <div>455 Foggy Heights, AZ 85004, US</div>\n" +
            "                                    <div>(123) 456-789</div>\n" +
            "                                    <div>company@example.com</div>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                        </header>\n" +
            "                        <main>\n" +
            "                            <div class=\"row contacts\">\n" +
            "                                <div class=\"col invoice-to\">\n" +
            "                                    <div class=\"text-gray-light\">INVOICE TO:</div>\n" +
            "                                    <h2 class=\"to\">John Doe</h2>\n" +
            "                                    <div class=\"address\">796 Silver Harbour, TX 79273, US</div>\n" +
            "                                    <div class=\"email\"><a href=\"mailto:john@example.com\">john@example.com</a>\n" +
            "                                    </div>\n" +
            "                                </div>\n" +
            "                                <div class=\"col invoice-details\">\n" +
            "                                    <h1 class=\"invoice-id\">INVOICE 3-2-1</h1>\n" +
            "                                    <div class=\"date\">Date of Invoice: 01/10/2018</div>\n" +
            "                                    <div class=\"date\">Due Date: 30/10/2018</div>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                            <table>\n" +
            "                                <thead>\n" +
            "                                    <tr>\n" +
            "                                        <th>#</th>\n" +
            "                                        <th class=\"text-left\">DESCRIPTION</th>\n" +
            "                                        <th class=\"text-right\">HOUR PRICE</th>\n" +
            "                                        <th class=\"text-right\">HOURS</th>\n" +
            "                                        <th class=\"text-right\">TOTAL</th>\n" +
            "                                    </tr>\n" +
            "                                </thead>\n" +
            "                                <tbody>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"no\">04</td>\n" +
            "                                        <td class=\"text-left\">\n" +
            "                                            <h3>\n" +
            "                                                <a target=\"_blank\" href=\"javascript:;\">\n" +
            "\t\t\t\t\t\t\t\t\t\tYoutube channel\n" +
            "\t\t\t\t\t\t\t\t\t\t</a>\n" +
            "                                            </h3>\n" +
            "                                            <a target=\"_blank\" href=\"javascript:;\">\n" +
            "\t\t\t\t\t\t\t\t\t\t   Useful videos\n" +
            "\t\t\t\t\t\t\t\t\t   </a> to improve your Javascript skills. Subscribe and stay tuned :)</td>\n" +
            "                                        <td class=\"unit\">$0.00</td>\n" +
            "                                        <td class=\"qty\">100</td>\n" +
            "                                        <td class=\"total\">$0.00</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"no\">01</td>\n" +
            "                                        <td class=\"text-left\">\n" +
            "                                            <h3>Website Design</h3>Creating a recognizable design solution based on the company's existing visual identity</td>\n" +
            "                                        <td class=\"unit\">$40.00</td>\n" +
            "                                        <td class=\"qty\">30</td>\n" +
            "                                        <td class=\"total\">$1,200.00</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"no\">02</td>\n" +
            "                                        <td class=\"text-left\">\n" +
            "                                            <h3>Website Development</h3>Developing a Content Management System-based Website</td>\n" +
            "                                        <td class=\"unit\">$40.00</td>\n" +
            "                                        <td class=\"qty\">80</td>\n" +
            "                                        <td class=\"total\">$3,200.00</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td class=\"no\">03</td>\n" +
            "                                        <td class=\"text-left\">\n" +
            "                                            <h3>Search Engines Optimization</h3>Optimize the site for search engines (SEO)</td>\n" +
            "                                        <td class=\"unit\">$40.00</td>\n" +
            "                                        <td class=\"qty\">20</td>\n" +
            "                                        <td class=\"total\">$800.00</td>\n" +
            "                                    </tr>\n" +
            "                                </tbody>\n" +
            "                                <tfoot>\n" +
            "                                    <tr>\n" +
            "                                        <td colspan=\"2\"></td>\n" +
            "                                        <td colspan=\"2\">SUBTOTAL</td>\n" +
            "                                        <td>$5,200.00</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td colspan=\"2\"></td>\n" +
            "                                        <td colspan=\"2\">TAX 25%</td>\n" +
            "                                        <td>$1,300.00</td>\n" +
            "                                    </tr>\n" +
            "                                    <tr>\n" +
            "                                        <td colspan=\"2\"></td>\n" +
            "                                        <td colspan=\"2\">GRAND TOTAL</td>\n" +
            "                                        <td>$6,500.00</td>\n" +
            "                                    </tr>\n" +
            "                                </tfoot>\n" +
            "                            </table>\n" +
            "                            <div class=\"thanks\">Thank you!</div>\n" +
            "                            <div class=\"notices\">\n" +
            "                                <div>NOTICE:</div>\n" +
            "                                <div class=\"notice\">A finance charge of 1.5% will be made on unpaid balances after 30 days.</div>\n" +
            "                            </div>\n" +
            "                        </main>\n" +
            "                        <footer>Invoice was created on a computer and is valid without the signature and seal.</footer>\n" +
            "                    </div>\n" +
            "                    <!--DO NOT DELETE THIS div. IT is responsible for showing footer always at the bottom-->\n" +
            "                    <div></div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>\n" +
            "</body>\n" +
            "</html>";

}
