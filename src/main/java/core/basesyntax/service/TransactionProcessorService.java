package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface TransactionProcessorService {
    void proccessing(List<FruitTransaction> fruitTransactionsList);
}
