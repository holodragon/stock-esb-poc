{
  "Header" : {
    "TxID" : "FCB91103G_1",
    "SystemKey" : "FCB66",
    "TxSeqNo" : "20190520000001",
    "MsgSeqNo" : "12345",
    "CltTimeStamp" : "2019-05-20 09:11:000000",
    "CustID" : "N1227418150",
    "UserID" : "ABCDE",
    "AcctNo" : "31150280273",
    "MsgDirection" : "RQ"
  },
  "TxRq" : {
    "AcctNo" : "${headers.acctNo}",
    "CustID": "${headers.custId}",
    "InqType" : "1"
  }
}
