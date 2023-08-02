package com.opentelemetry.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetOrderImpl implements GetOrder {

    @Autowired
    PriceDetails priceDetails;

    @Override
    public String getOrders() {
            priceDetails.calculatePrice();
            return "{\"OrderProductResponse\": {\n" +
                    "  \"@ServiceVersionNumber\": \"4.0\",\n" +
                    "  \"TransactionDetail\":   {\n" +
                    "    \"ServiceTransactionID\": \"Id-7d06592852cda6cd0cdbffff-2\",\n" +
                    "    \"TransactionTimestamp\": \"2014-01-08T14:28:14.704-05:00\"\n" +
                    "  },\n" +
                    "  \"TransactionResult\":   {\n" +
                    "    \"SeverityText\": \"Information\",\n" +
                    "    \"ResultID\": \"CM000\",\n" +
                    "    \"ResultText\": \"Success\"\n" +
                    "  },\n" +
                    "  \"OrderProductResponseDetail\":   {\n" +
                    "    \"InquiryDetail\":     {\n" +
                    "      \"DUNSNumber\": \"804735132\",\n" +
                    "      \"CountryISOAlpha2Code\": \"US\"\n" +
                    "    },\n" +
                    "    \"Product\":     {\n" +
                    "      \"DNBProductID\": \"PI_DTL\",\n" +
                    "      \"Organization\":       {\n" +
                    "        \"SubjectHeader\": {\"DUNSNumber\": \"804735132\"},\n" +
                    "        \"Telecommunication\": {\"TelephoneNumber\":         {\n" +
                    "          \"TelecommunicationNumber\": \"(650) 555-0000\",\n" +
                    "          \"InternationalDialingCode\": 1\n" +
                    "        }},\n" +
                    "        \"Location\": {\"PrimaryAddress\":         {\n" +
                    "          \"StreetAddressLine\": [{\"LineText\": \"492 Koller St\"}],\n" +
                    "          \"PrimaryTownName\": \"San Francisco\",\n" +
                    "          \"CountryISOAlpha2Code\": \"US\",\n" +
                    "          \"TerritoryAbbreviatedName\": \"CA\",\n" +
                    "          \"PostalCode\": \"94110\",\n" +
                    "          \"TerritoryOfficialName\": \"California\"\n" +
                    "        }},\n" +
                    "        \"OrganizationName\": {\"OrganizationPrimaryName\": [{\"OrganizationName\": {\"$\": \"Gorman Manufacturing Company, Inc.\"}}]},\n" +
                    "        \"BusinessTrading\": {\"Purchaser\":         {\n" +
                    "          \"CurrentPaydexScore\": {\"TwelveMonthsPaydex\": {\"PaydexScore\": 75}},\n" +
                    "          \"PurchaserDerivedData\":           [\n" +
                    "            {\"TwelveMonthsDataCoveragePayments\": {\"PaymentPeriodSummary\": [            {\n" +
                    "              \"SummaryPeriod\": \"P12M\",\n" +
                    "              \"PaymentsWithHighCredit\":               {\n" +
                    "                \"ExperienceCount\": 13,\n" +
                    "                \"HighCreditMaximumAmount\": {\"$\": 15000},\n" +
                    "                \"AverageHighCreditAmount\": {\"$\": 3440}\n" +
                    "              }\n" +
                    "            }]}},\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-10\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            },\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-09\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            },\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-08\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            },\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-07\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            },\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-06\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            },\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-05\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            },\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-04\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            },\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-03\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            },\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-02\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            },\n" +
                    "                        {\n" +
                    "              \"TradeDataYearMonth\": {\"$\": \"2013-01\"},\n" +
                    "              \"OneMonthDataCoveragePayments\":               {\n" +
                    "                \"OwedTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"PastDueTotalMaximumAmount\": {\"$\": 920},\n" +
                    "                \"SuppliersCount\": 1,\n" +
                    "                \"AccountsCount\": 1,\n" +
                    "                \"OwedTotalAmount\": {\"$\": 920},\n" +
                    "                \"TotalPastDueTotalAmount\": {\"$\": 920},\n" +
                    "                \"CurrentTotalAmount\": {\"$\": 0},\n" +
                    "                \"SummarizedPastDue\": [                {\n" +
                    "                  \"DaysLowQuantity\": 121,\n" +
                    "                  \"DaysHighQuantity\": 150,\n" +
                    "                  \"ExperiencesCount\": 1,\n" +
                    "                  \"TotalAmount\": {\"$\": 920}\n" +
                    "                }]\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ]\n" +
                    "        }}\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}}";
    }
}
