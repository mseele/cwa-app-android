package de.rki.coronawarnapp.worker

import java.util.concurrent.TimeUnit

/**
 * The background work constants are used inside the BackgroundWorkScheduler
 *
 * @see BackgroundWorkScheduler
 */
object BackgroundConstants {

    /**
     * Tag for diagnosis key retrieval one time work
     */
    const val DIAGNOSIS_KEY_ONE_TIME_WORKER_TAG = "DIAGNOSIS_KEY_ONE_TIME_WORKER"

    /**
     * Tag for diagnosis key retrieval periodic work
     */
    const val DIAGNOSIS_KEY_PERIODIC_WORKER_TAG = "DIAGNOSIS_KEY_PERIODIC_WORKER"

    /**
     * Unique name for diagnosis key retrieval one time work
     */
    const val DIAGNOSIS_KEY_ONE_TIME_WORK_NAME = "DiagnosisKeyBackgroundOneTimeWork"

    /**
     * Unique name for diagnosis key retrieval periodic work
     */
    const val DIAGNOSIS_KEY_PERIODIC_WORK_NAME = "DiagnosisKeyBackgroundPeriodicWork"

    /**
     * Total minutes in one day
     */
    const val MINUTES_IN_DAY = 1440

    /**
     * Total tries count for diagnosis key retrieval per day
     * Internal requirement
     */
    const val DIAGNOSIS_KEY_RETRIEVAL_TRIES_PER_DAY = 12

    /**
     * Maximum tries count for diagnosis key retrieval per day
     * Google API limit
     */
    const val GOOGLE_API_MAX_CALLS_PER_DAY = 20

    /**
     * Kind initial delay in minutes for periodic work for accessibility reason
     *
     * @see TimeUnit.MINUTES
     */
    const val DIAGNOSIS_KEY_PERIODIC_KIND_DELAY = 1L

    /**
     * Minimum initial delay in minutes for diagnosis key retrieval one time work
     *
     * @see DiagnosisKeyRetrievalTimeCalculator.getPossibleSchedulingTimes
     * @see TimeUnit.MINUTES
     */
    const val DIAGNOSIS_KEY_RETRIEVAL_MIN_DELAY = 0

    /**
     * Maximum initial delay in minutes for diagnosis key retrieval one time work
     *
     * @see DiagnosisKeyRetrievalTimeCalculator.getPossibleSchedulingTimes
     * @see TimeUnit.MINUTES
     */
    const val DIAGNOSIS_KEY_RETRIEVAL_MAX_DELAY = 59

    /**
     * Time schedule start in minutes of day
     * 07:00 = 420 minutes passed midnight
     *
     * @see TimeUnit.MINUTES
     */
    const val TIME_RANGE_MIN = 420

    /**
     * Time schedule stop in minutes of day
     * 23:59 = 1439 minutes passed midnight
     *
     * @see TimeUnit.MINUTES
     */
    const val TIME_RANGE_MAX = 1439
}
