package com.amocrm.amocrmclient.transaction.entity.set;


import com.amocrm.amocrmclient.transaction.entity.TransactionResponseError;

import java.util.List;

public class STResponseAdd {

    public List<STAdd> transactions;

    public List<TransactionResponseError> errors;
}
