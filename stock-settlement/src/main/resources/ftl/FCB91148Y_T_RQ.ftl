<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE FCB91148Y_T>
<XML>
	<Header>
		<TxID>FCB91148Y_T</TxID>
		<SystemKey>FCB00</SystemKey>
		<TxSeqNo>20190805151601</TxSeqNo>
		<MsgSeqNo>20009</MsgSeqNo>
		<CltTimeStamp>2019-08-05 15:16:01.013</CltTimeStamp>
		<CustID />
		<UserID />
		<AcctNo />
		<MsgDirection>RQ</MsgDirection>
	</Header>
	<TxRq>
		<PayerBank>00700000</PayerBank>
		<PayerAcctNo>${headers.ACCTNO}</PayerAcctNo>
		<PayerID>${headers.CUSTID}</PayerID>
		<TxSeqNo>${headers.TXSEQNO}</TxSeqNo>
		<TxSubSeq>${headers.TXSUBSEQ}</TxSubSeq>
		<PayeeBank>00700000</PayeeBank>
		<PayeeAcctNo>00000000000</PayeeAcctNo>
		<Amt>${headers.AMT}</Amt>
		<PmtType>36</PmtType>
		<TxType>
		</TxType>
		<CMemo>ST1720 11</CMemo>
		<DelayFlag>0</DelayFlag>
		<ClsDate>0000000</ClsDate>
		<PmtDate>1080805</PmtDate>
		<InFee>0</InFee>
		<ExFee>0</ExFee>
		<FeeReceivable>0</FeeReceivable>
		<CustID>A2345678900</CustID>
		<NetChl>B</NetChl>
		<PayeeName>
		</PayeeName>
		<LoanFlag>N</LoanFlag>
		<ReimburseAcct>000000000</ReimburseAcct>
		<FiscSeqNo>116520A2345678900</FiscSeqNo>
		<EcFlag>0</EcFlag>
	</TxRq>
</XML>
