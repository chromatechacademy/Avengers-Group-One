package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class FeesCollectionModuleStepImpl extends PageInitializer {

     /**
      * Use this method to assert Fees Collection module 

      * @param expectedCollectFeesModule
      * @param expectedSearchFeesPaymentModule
      * @param expectedSearchDueFeesModule
      * @param expectedFeesMasterModule
      * @param expectedFeesGroupModule
      * @param expectedFeesTypeModule
      * @param expectedFeesDiscountModule
      * @param expectedFeesCarryForwardModule
      * @param expectedFeesReminderModule
      */
    public static void feesCollectionModuleAssert(String expectedCollectFeesModule,
            String expectedSearchFeesPaymentModule, String expectedSearchDueFeesModule, String expectedFeesMasterModule,
            String expectedFeesGroupModule, String expectedFeesTypeModule, String expectedFeesDiscountModule,
            String expectedFeesCarryForwardModule, String expectedFeesReminderModule) {

        String actualCollectFeesModule = feesCollectionModulePage.actualCollectFeesModule.getText();
        CommonUtils.assertEquals(expectedCollectFeesModule, actualCollectFeesModule);

        String actualSearchFeesPaymentModule = feesCollectionModulePage.actualSearchFeesPaymentModule.getText();
        CommonUtils.assertEquals(expectedSearchFeesPaymentModule, actualSearchFeesPaymentModule);

        String actualSearchDueFeesModule = feesCollectionModulePage.actualSearchDueFeesModule.getText();
        CommonUtils.assertEquals(expectedSearchDueFeesModule, actualSearchDueFeesModule);

        String actualFeesMasterModule = feesCollectionModulePage.actualFeesMasterModule.getText();
        CommonUtils.assertEquals(expectedFeesMasterModule, actualFeesMasterModule);

        String actualFeesGroupModule = feesCollectionModulePage.actualFeesGroupModule.getText();
        CommonUtils.assertEquals(expectedFeesGroupModule, actualFeesGroupModule);

        String actualFeesTypeModule = feesCollectionModulePage.actualFeesTypeModule.getText();
        CommonUtils.assertEquals(expectedFeesTypeModule, actualFeesTypeModule);

        String actualFeesDiscountModule = feesCollectionModulePage.actualFeesDiscountModule.getText();
        CommonUtils.assertEquals(expectedFeesDiscountModule, actualFeesDiscountModule);

        String actualFeesCarryForwardModule = feesCollectionModulePage.actualFeesCarryForwardModule.getText();
        CommonUtils.assertEquals(expectedFeesCarryForwardModule, actualFeesCarryForwardModule);

        String actualFeesReminderModule = feesCollectionModulePage.actualFeesReminderModule.getText();
        CommonUtils.assertEquals(expectedFeesReminderModule, actualFeesReminderModule);

        CommonUtils.scrollIntoView(feesCollectionModulePage.actualIncomeModule);
    }

}
