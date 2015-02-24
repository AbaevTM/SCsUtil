// Generated from /media/timur/EE286A072869CEE1/Work/SC/SCSTranslator/Grammars/scsNew.g4 by ANTLR 4.1
package net.ostis.scs.util.parsing.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SCSNewParser}.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface SCSNewVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SCSNewParser#idtf}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdtf(@NotNull SCSNewParser.IdtfContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#idtf_tuple}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdtf_tuple(@NotNull SCSNewParser.Idtf_tupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#attrs_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttrs_list(@NotNull SCSNewParser.Attrs_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#sentence_level1}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSentence_level1(@NotNull SCSNewParser.Sentence_level1Context ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#sentence}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSentence(@NotNull SCSNewParser.SentenceContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link SCSNewParser#sentence_internal_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSentence_internal_list(
			@NotNull SCSNewParser.Sentence_internal_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#attrs_idtf_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttrs_idtf_list(@NotNull SCSNewParser.Attrs_idtf_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#idtf_level1}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdtf_level1(@NotNull SCSNewParser.Idtf_level1Context ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#sentence_level2_6}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSentence_level2_6(@NotNull SCSNewParser.Sentence_level2_6Context ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#syntax}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(@NotNull SCSNewParser.SyntaxContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#sentence_internal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSentence_internal(@NotNull SCSNewParser.Sentence_internalContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#attr_sep}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttr_sep(@NotNull SCSNewParser.Attr_sepContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#idtf_edge}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdtf_edge(@NotNull SCSNewParser.Idtf_edgeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#sentence_assignment}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSentence_assignment(
			@NotNull SCSNewParser.Sentence_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#idtf_attrs}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdtf_attrs(@NotNull SCSNewParser.Idtf_attrsContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#idtf_set}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdtf_set(@NotNull SCSNewParser.Idtf_setContext ctx);

	/**
	 * Visit a parse tree produced by {@link SCSNewParser#idtf_internal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdtf_internal(@NotNull SCSNewParser.Idtf_internalContext ctx);
}