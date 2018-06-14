package org.platypus

//If you come here is because you see this weird annotation
//First my workflow is write code, improved code, write doc, improved code, change doc, then test this code

/**
 * I should document this element but i don't have the courage, or if [WorkInProgress] is applied then i have a valid excuse
 * I not big fan of TDD
 */
@Retention(AnnotationRetention.SOURCE)
annotation class INeedToTestThis

/**
 * I should document this element but i don't have the courage, or if [ICurrentlyWorkingOnThis] then i have a valid excuse
 */
@Retention(AnnotationRetention.SOURCE)
annotation class INeedToDocumentThis

/**
 * I don't like this element but currently I need it
 */
@Retention(AnnotationRetention.SOURCE)
annotation class IShouldRefractorThis(val why:String="Not proud of myself")

/**
 * I don't like the implementation of this element but currently its work
 */
@Retention(AnnotationRetention.SOURCE)
annotation class IShouldImprovedThis(val why:String="I can do better")

/**
 * Currently work on this new element, let me know if the work isn't fast enough :-)
 */
@Retention(AnnotationRetention.SOURCE)
annotation class ICurrentlyWorkingOnThis(val why:String="")



